package de.uol.app.ui.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.skydoves.powerspinner.PowerSpinnerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.uol.app.R;
import de.uol.app.utils.Prefs;
import de.uol.app.utils.Utils;
import de.uol.app.utils.Variables;

public class SelectionActivity extends AppCompatActivity {

    @BindView(R.id.btn_load)
    Button buttonLoad;

    @BindView(R.id.spin_faculty)
    PowerSpinnerView spinnerFaculty;
    @BindView(R.id.spin_semesters)
    PowerSpinnerView spinnerSemester;
    @BindView(R.id.spin_semesters_ongoing)
    PowerSpinnerView spinnerSemesterOngoing;
    @BindView(R.id.spin_zwai)
    PowerSpinnerView spinnerZwai;
    @BindView(R.id.spin_lehtamt)
    PowerSpinnerView spinnerLeht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        initSpinners();
        checkIfSpinnerAllSelected();
    }

    private void initSpinners() {
        if (Variables.spinnerFacultyIndex != -1) {
            spinnerFaculty.selectItemByIndex(Variables.spinnerFacultyIndex);
            spinnerFaculty.setEnabled(false);
            spinnerFaculty.setBackgroundColor(getResources().getColor(R.color.colorGray));
        }
        if (Variables.spinnerSemesterIndex != -1)
            spinnerSemester.selectItemByIndex(Variables.spinnerSemesterIndex);
        if (Variables.spinnerSemesterOngoingIndex != -1)
            spinnerSemesterOngoing.selectItemByIndex(Variables.spinnerSemesterOngoingIndex);
        if (Variables.spinnerZwaiIndex != -1)
            spinnerZwai.selectItemByIndex(Variables.spinnerZwaiIndex);
        if (Variables.spinnerLehtIndex != -1)
            spinnerLeht.selectItemByIndex(Variables.spinnerLehtIndex);

        spinnerFaculty.setOnSpinnerItemSelectedListener((i, o) -> {
            Variables.spinnerFacultyIndex = i;
            checkIfSpinnerAllSelected();
        });

        spinnerSemester.setOnSpinnerItemSelectedListener((i, o) -> {
            Variables.spinnerSemesterIndex = i;
            checkIfSpinnerAllSelected();
        });

        spinnerSemesterOngoing.setOnSpinnerItemSelectedListener((i, o) -> {
            Variables.spinnerSemesterOngoingIndex = i;
            checkIfSpinnerAllSelected();
        });
        spinnerZwai.setOnSpinnerItemSelectedListener((i, o) -> {
            Variables.spinnerZwaiIndex = i;
            checkIfSpinnerAllSelected();
        });
        spinnerLeht.setOnSpinnerItemSelectedListener((i, o) -> {
            Variables.spinnerLehtIndex = i;
            checkIfSpinnerAllSelected();
        });
    }

    private void checkIfSpinnerAllSelected() {
        if (Variables.spinnerFacultyIndex != -1
                && Variables.spinnerSemesterIndex != -1
                && Variables.spinnerSemesterOngoingIndex != -1) {

            buttonLoad.setBackgroundTintList(
                    AppCompatResources.getColorStateList(this, R.color.colorAccent));
            buttonLoad.setEnabled(true);

            if (Variables.spinnerFacultyIndex == 2) {
                if (Variables.spinnerZwaiIndex != -1
                        && Variables.spinnerLehtIndex != -1) {
                    buttonLoad.setBackgroundTintList(
                            AppCompatResources.getColorStateList(this, R.color.colorAccent));
                    buttonLoad.setEnabled(true);
                } else {
                    buttonLoad.setBackgroundTintList(
                            AppCompatResources.getColorStateList(this, R.color.colorGray));
                    buttonLoad.setEnabled(false);
                }
            }
        } else {
            buttonLoad.setBackgroundTintList(
                    AppCompatResources.getColorStateList(this, R.color.colorGray));
            buttonLoad.setEnabled(false);
        }

        if (Variables.spinnerFacultyIndex == 2) {
            spinnerZwai.setVisibility(View.VISIBLE);
            spinnerLeht.setVisibility(View.VISIBLE);
        } else {
            spinnerZwai.setVisibility(View.INVISIBLE);
            spinnerLeht.setVisibility(View.INVISIBLE);
        }
    }

    @OnClick(R.id.btn_info)
    void onInfoClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.info)).
                setMessage(getString(R.string.info_text)).
                setPositiveButton("OK", null).
                show();
    }

    @OnClick(R.id.btn_load)
    void onLoadClick() {
        Prefs.saveBasicInfo(this);
        if (Variables.spinnerSemesterOngoingIndex == 0)
            Utils.startActivityWithAnim(this, RecommendationActivity.class);
        else
            Utils.startActivityWithAnim(this, SubjectsActivity.class);
        finish();
    }
}
