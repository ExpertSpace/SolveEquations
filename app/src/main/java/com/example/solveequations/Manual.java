package com.example.solveequations;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Manual extends AppCompatActivity {

    private MathView mathView;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_activity);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setupMathView();
        mathView.setText(getString(R.string.manual));
    }

    public void setupMathView() {
        mathView = findViewById(R.id.mathView);
        mathView.setPixelScaleType(MathView.Scale.SCALE_SP);
        mathView.setTextSize(16);
        mathView.setTextColor("#3ecd5e");
    }
}
