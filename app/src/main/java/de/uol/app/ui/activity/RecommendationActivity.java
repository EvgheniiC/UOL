package de.uol.app.ui.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.skydoves.powerspinner.PowerSpinnerView;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.uol.app.R;
import de.uol.app.data.ModuleModel;
import de.uol.app.data.SubjectsData;
import de.uol.app.utils.Prefs;
import de.uol.app.utils.Utils;
import de.uol.app.utils.Variables;

public class RecommendationActivity extends AppCompatActivity {

    @BindView(R.id.spin_recommend_1)
    PowerSpinnerView spinnerRecommend1;
    @BindView(R.id.spin_recommend_2)
    PowerSpinnerView spinnerRecommend2;
    @BindView(R.id.spin_recommend_3)
    PowerSpinnerView spinnerRecommend3;
    @BindView(R.id.spin_recommend_4)
    PowerSpinnerView spinnerRecommend4;
    @BindView(R.id.spin_recommend_5)
    PowerSpinnerView spinnerRecommend5;

    private List<PowerSpinnerView> spinners;

    private List<String> modulesStrings;
    private List<ModuleModel> modules;

    private List<String> recommendStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        ButterKnife.bind(this);

        init();
    }

    private void init() {

        initFiltration();
        initSpinners();
    }

    private void initFiltration() {
        SubjectsData subjectsData = new SubjectsData();
        List<ArrayList<String>> facultyRecommendModules = new ArrayList<>();

        List<ModuleModel> facultyModules = new ArrayList<>();

        switch (Variables.spinnerFacultyIndex) {
            case 0:
                facultyModules = subjectsData.getInfModules();
                facultyRecommendModules = subjectsData.getInfRecommend();
                break;
            case 1:
                facultyModules = subjectsData.getWirtsModules();
                facultyRecommendModules = subjectsData.getWirtsRecommen();
                break;
            case 2:
                if (Variables.spinnerZwaiIndex == 0) {
                    facultyModules = subjectsData.getZwei30Modules();
                    facultyRecommendModules = subjectsData.getZwei30Recommend();
                } else {
                    facultyModules = subjectsData.getZwei60Modules();
                    facultyRecommendModules = subjectsData.getZwei60Recommend();
                }
                break;
        }

        Set<ModuleModel> duplicateModuleRemovedSet = new LinkedHashSet<>(facultyModules);
        facultyModules.clear();
        facultyModules.addAll(duplicateModuleRemovedSet);

        modules = new ArrayList<>(facultyModules);

        createRecommendStrings(facultyRecommendModules);
        filterBySemester(facultyModules);
        createModulesStrings();
    }

    private void initSpinners() {
        spinners = new ArrayList<>();
        spinners.add(spinnerRecommend1);
        spinners.add(spinnerRecommend2);
        spinners.add(spinnerRecommend3);
        spinners.add(spinnerRecommend4);
        spinners.add(spinnerRecommend5);

        for (int i = 0; i < spinners.size(); i++) {
            final PowerSpinnerView spinnerView = spinners.get(i);

            spinnerView.setItems(modulesStrings);

            int selectIndex = -1;

            try {
                selectIndex = modulesStrings.indexOf(recommendStrings.get(i));
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }

            if (selectIndex == -1)
                spinnerView.selectItemByIndex(0);
            else
                spinnerView.selectItemByIndex(selectIndex);

            checkAndChangeColor(spinnerView);
            spinnerView.setOnSpinnerItemSelectedListener((index, o) -> {
                checkAndChangeColor(spinnerView);
            });
        }
    }

    private void createRecommendStrings(List<ArrayList<String>> facultyRecommendModules) {
        recommendStrings = new ArrayList<>();
        List<ModuleModel> tmpModules = new ArrayList<>();
        Map<String, String> statusMap = Prefs.loadStatusMap(this);

        for (ArrayList<String> strings : facultyRecommendModules) {
            for (String moduleString : strings) {
                ModuleModel moduleModel = getModuleByID(moduleString);
                try {
                    moduleModel.setStatus(ModuleModel.Status.valueOf(statusMap.get(moduleModel.id)));
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }


                if (moduleModel.getStatus() != ModuleModel.Status.pass) {
                    if (moduleModel.getStatus() == ModuleModel.Status.fail) {
                        tmpModules.add(0, moduleModel);
                        break;
                    } else {
                        tmpModules.add(moduleModel);
                        break;
                    }
                }
            }
        }

        for (ModuleModel moduleModel : modules) {
            try {
                moduleModel.setStatus(ModuleModel.Status.valueOf(statusMap.get(moduleModel.id)));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

            if (moduleModel.getStatus() == ModuleModel.Status.fail)
                tmpModules.add(0, moduleModel);
        }

        ModuleModel.Season season = ModuleModel.Season.demi;
        switch (Variables.spinnerSemesterIndex) {
            case 0:
                season = ModuleModel.Season.winter;
                break;
            case 1:
                season = ModuleModel.Season.summer;
                break;
        }

        Set<ModuleModel> duplicateModuleRemovedSet = new LinkedHashSet<>(tmpModules);
        tmpModules.clear();
        tmpModules.addAll(duplicateModuleRemovedSet);


        for (ModuleModel moduleModel : tmpModules) {
            if (moduleModel.season == season
                    || moduleModel.season == ModuleModel.Season.demi
                    || moduleModel.season == ModuleModel.Season.unregular) {
                recommendStrings.add(moduleModel.id + " - " + moduleModel.name + " (" + moduleModel.keys.get(0) + ")");
            }
        }
    }

    private ModuleModel getModuleByID(String id) {
        for (ModuleModel moduleModel : modules) {
            if (moduleModel.id.equals(id))
                return moduleModel;
        }
        return null;
    }

    private void filterBySemester(List<ModuleModel> facultyModels) {
        this.modules = new ArrayList<>();
        ModuleModel.Season season = ModuleModel.Season.demi;
        switch (Variables.spinnerSemesterIndex) {
            case 0:
                season = ModuleModel.Season.winter;
                break;
            case 1:
                season = ModuleModel.Season.summer;
                break;
        }

        Map<String, String> statusMap = Prefs.loadStatusMap(this);


        for (ModuleModel moduleModel : facultyModels) {
            if (moduleModel.season == season
                    || moduleModel.season == ModuleModel.Season.demi
                    || moduleModel.season == ModuleModel.Season.unregular) {
                try {
                    moduleModel.setStatus(ModuleModel.Status.valueOf(statusMap.get(moduleModel.id)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (moduleModel.getStatus() != ModuleModel.Status.pass)
                    this.modules.add(moduleModel);
            }
        }
    }

    private void createModulesStrings() {
        modulesStrings = new ArrayList<>();
        modulesStrings.add("---");

        for (ModuleModel moduleModel : modules) {
            modulesStrings.add(moduleModel.id + " - " + moduleModel.name + " (" + moduleModel.keys.get(0) + ")");
        }
    }

    private void checkAndChangeColor(PowerSpinnerView spinnerView) {
        spinnerView.setBackgroundColor(getResources().getColor(R.color.colorGray));

        int itemIndex = spinnerView.getSelectedIndex();
        if (itemIndex == 0)
            return;

        for (PowerSpinnerView mSpinnerView : spinners) {
            if (itemIndex == mSpinnerView.getSelectedIndex() && spinnerView != mSpinnerView) {
                spinnerView.selectItemByIndex(0);
                Toast.makeText(this, "Already selected", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        String selected = modulesStrings.get(spinnerView.getSelectedIndex());
        if (selected.toLowerCase().contains("(pb)"))
            spinnerView.setBackgroundColor(getResources().getColor(R.color.colorGreenLight));
        if (selected.toLowerCase().contains("(wahl)"))
            spinnerView.setBackgroundColor(getResources().getColor(R.color.colorYellowLight));

    }

    @OnClick(R.id.btn_modules)
    void onModulesClick() {
        Utils.startActivityWithAnim(this, SubjectsActivity.class);
        finish();
    }

    @OnClick(R.id.btn_change)
    void onChangeClick() {
        Utils.startActivityWithAnim(this, SelectionActivity.class);
        finish();
    }

    @OnClick(R.id.btn_history)
    void onHistoryClick() {
        Utils.startActivityWithAnim(this, HistoryActivity.class);
        finish();
    }

    @OnClick(R.id.btn_reset)
    void onResetClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Clear all data").
                setMessage("Are you sure?").
                setNegativeButton("No", null).
                setPositiveButton("Yes", (dialogInterface, i) -> {
                    Variables.spinnerSemesterIndex = -1;
                    Variables.spinnerFacultyIndex = -1;
                    Variables.spinnerSemesterOngoingIndex = -1;
                    Variables.spinnerZwaiIndex = -1;
                    Variables.spinnerLehtIndex = -1;

                    Prefs.saveBasicInfo(this);
                    Prefs.deleteStatusMap(this);
                    Utils.startActivityWithAnim(this, SelectionActivity.class);
                    finish();
                }).
                show();
    }
}
