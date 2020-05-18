package de.uol.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.uol.app.R;
import de.uol.app.data.ModuleModel;
import de.uol.app.data.SubjectsData;
import de.uol.app.ui.adapter.SubjectsAdapter;
import de.uol.app.utils.Utils;
import de.uol.app.utils.Variables;

public class HistoryActivity extends AppCompatActivity {

    @BindView(R.id.rv_subjects)
    RecyclerView recyclerSubjects;
    private List<ModuleModel> historyModules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        SubjectsData subjectsData = new SubjectsData();
        historyModules = new ArrayList<>();
        //TODO history
        initRecycler();
    }

    private void initRecycler() {
        recyclerSubjects.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerSubjects.getContext(),
                DividerItemDecoration.VERTICAL);
        recyclerSubjects.addItemDecoration(dividerItemDecoration);

        SubjectsAdapter subjectsAdapter = new SubjectsAdapter(historyModules, null);
        recyclerSubjects.setAdapter(subjectsAdapter);
    }


    @OnClick(R.id.btn_save)
    void onSaveClick() {
        Utils.startActivityWithAnim(this, RecommendationActivity.class);
        finish();
    }
}
