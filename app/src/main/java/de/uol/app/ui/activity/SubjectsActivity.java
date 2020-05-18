package de.uol.app.ui.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.uol.app.R;
import de.uol.app.data.ModuleModel;
import de.uol.app.data.SubjectsData;
import de.uol.app.ui.adapter.SubjectsAdapter;
import de.uol.app.utils.Prefs;
import de.uol.app.utils.Utils;
import de.uol.app.utils.Variables;

public class SubjectsActivity extends AppCompatActivity implements SubjectsAdapter.OnItemStatusChange {

    @BindView(R.id.rv_subjects)
    RecyclerView recyclerSubjects;

    @BindView(R.id.tv_kp)
    TextView textKP;
    @BindView(R.id.tv_pf)
    TextView textPF;
    @BindView(R.id.tv_pb)
    TextView textPB;
    @BindView(R.id.tv_wahl)
    TextView textWahl;
    @BindView(R.id.tv_mathe)
    TextView textMathe;
    @BindView(R.id.tv_wi)
    TextView textWI;
    @BindView(R.id.tv_pi)
    TextView textPI;
    @BindView(R.id.tv_wahl_pi)
    TextView textWahlPi;
    @BindView(R.id.tv_inf)
    TextView textInf;

    private List<ModuleModel> facultyModules;

    private List<ModuleModel> seasonFilteredModules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        SubjectsData subjectsData = new SubjectsData();
        facultyModules = new ArrayList<>();

        switch (Variables.spinnerFacultyIndex) {
            case 0:
                facultyModules = subjectsData.getInfModules();

                textWI.setVisibility(View.GONE);
                textPI.setVisibility(View.GONE);
                textWahlPi.setVisibility(View.GONE);
                textInf.setVisibility(View.GONE);
                break;
            case 1:
                facultyModules = subjectsData.getWirtsModules();

                textWahl.setVisibility(View.GONE);
                break;
            case 2:
                if (Variables.spinnerZwaiIndex == 0)
                    facultyModules = subjectsData.getZwei30Modules();
                else
                    facultyModules = subjectsData.getZwei60Modules();

                textWI.setVisibility(View.GONE);
                textPI.setVisibility(View.GONE);
                textWahlPi.setVisibility(View.GONE);
                textInf.setVisibility(View.GONE);
                textMathe.setVisibility(View.GONE);
                break;
        }
        filterBySemester(facultyModules);
        loadModulesStatus();

        calculateMark();
        initRecycler();
    }

    private void initRecycler() {
        recyclerSubjects.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerSubjects.getContext(),
                DividerItemDecoration.VERTICAL);
        recyclerSubjects.addItemDecoration(dividerItemDecoration);

        SubjectsAdapter subjectsAdapter = new SubjectsAdapter(seasonFilteredModules, this);
        recyclerSubjects.setAdapter(subjectsAdapter);
    }

    private void filterBySemester(List<ModuleModel> modules) {
        seasonFilteredModules = new ArrayList<>();
        ModuleModel.Season season = ModuleModel.Season.demi;
        switch (Variables.spinnerSemesterIndex) {
            case 0:
                season = ModuleModel.Season.winter;
                break;
            case 1:
                season = ModuleModel.Season.summer;
                break;
        }
        if (Variables.spinnerSemesterOngoingIndex == 0) {
            for (ModuleModel moduleModel : modules) {
                if (moduleModel.season == season
                        || moduleModel.season == ModuleModel.Season.demi
                        || moduleModel.season == ModuleModel.Season.unregular) {
                    seasonFilteredModules.add(moduleModel);
                }
            }
        } else {
            seasonFilteredModules.addAll(modules);
        }
    }

    private void saveModulesStatus() {
        HashMap<String, String> statusHash = new LinkedHashMap<>();
        for (ModuleModel moduleModel : facultyModules) {
            statusHash.put(moduleModel.id, moduleModel.getStatus().name());
        }
        Prefs.saveStatusMap(this, statusHash);
    }

    private void loadModulesStatus() {
        Map<String, String> statusMap = Prefs.loadStatusMap(this);
        for (ModuleModel moduleModel : seasonFilteredModules) {
            try {
                moduleModel.setStatus(ModuleModel.Status.valueOf(statusMap.get(moduleModel.id)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void calculateMark() {
        int kp = 0, pf = 0, pb = 0, wahl = 0, mathe = 0,
                pi = 0, wi = 0, wahlpi = 0, inf = 0;

        for (ModuleModel moduleModel : seasonFilteredModules) {
            if (moduleModel.getStatus() == ModuleModel.Status.pass) {
                kp += moduleModel.mark;
                String key = moduleModel.keys.get(1).toLowerCase();
                if (key.equals("pb")) {
                    pb += moduleModel.mark;
                }
                if (key.equals("pflicht") || key.equals("basis-pflicht")) {
                    pf += moduleModel.mark;
                }
                if (key.equals("wahl")) {
                    wahl += moduleModel.mark;
                }
                if (key.equals("wahl-mathe")) {
                    mathe += moduleModel.mark;
                }
                if (key.equals("piundai")) {//TODO
                    pi += moduleModel.mark;
                }
                if (key.equals("as-wiwi")) {
                    wi += moduleModel.mark;
                }
                if (key.equals("wahl-pi")) {
                    wahlpi += moduleModel.mark;
                }
                if (key.equals("as-informatik")) {
                    inf += moduleModel.mark;
                }
            }
        }

        textKP.setText(getString(R.string.kp, kp));

        textPF.setText(getString(R.string.pflicht_kp, pf));
        textPB.setText(getString(R.string.pb_kp, pb));
        textWahl.setText(getString(R.string.wahl_kp, wahl));
        textMathe.setText(getString(R.string.mathe_wahl_kp, mathe));
        textWI.setText(getString(R.string.wi_kp, wi));
        textPI.setText(getString(R.string.pi_kp, pi));
        textWahlPi.setText(getString(R.string.wahl_pi_kp, wahlpi));
        textInf.setText(getString(R.string.inf_kp, inf));

    }

    @OnClick(R.id.btn_save)
    void onSaveClick() {
        saveModulesStatus();
        Utils.startActivityWithAnim(this, RecommendationActivity.class);
        finish();
    }


    @OnClick(R.id.btn_info)
    void onInfoClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.info)).
                setMessage(getString(R.string.info_subject_text)).
                setPositiveButton("OK", null).
                show();
    }

    @OnClick(R.id.btn_back)
    void onBackClick() {
        Utils.startActivityWithAnim(this, RecommendationActivity.class);
        finish();
    }

    @Override
    public void onStatusChange() {
        calculateMark();
    }

    @Override
    public void onBackPressed() {
        Utils.startActivityWithAnim(this, RecommendationActivity.class);
        finish();
    }
}
