package de.uol.app.ui.activity;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import de.uol.app.R;
import de.uol.app.utils.Prefs;
import de.uol.app.utils.Utils;
import de.uol.app.utils.Variables;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Prefs.loadBasicInfo(this);

        new Handler().postDelayed(() -> {
            if (Variables.spinnerFacultyIndex != -1)
                Utils.startActivityWithAnim(this, RecommendationActivity.class);
            else
                Utils.startActivityWithAnim(this, SelectionActivity.class);
            finish();
        }, 1500);
    }
}