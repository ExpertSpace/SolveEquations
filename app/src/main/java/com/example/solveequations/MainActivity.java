package com.example.solveequations;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.zanvent.mathview.MathView;

public class MainActivity extends AppCompatActivity {

    MathView mathView;

    final String MATH_ML_INSERT = "$$";

    int a;
    int b;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMathView();
        randomCoefficientQuadraticEquations();
    }

    private void setupMathView() {
        mathView = findViewById(R.id.mathView);
        mathView.setPixelScaleType(MathView.Scale.SCALE_SP);
        mathView.setTextSize(30);
        mathView.setTextColor("#3ecd5e");
    }

    private void randomCoefficientQuadraticEquations() {
        a = (int) (0 + Math.random() * 5);
        b = (int) (0 + Math.random() * 5);
        c = (int) (0 + Math.random() * 5);

        if (a == 0 && b == 0 && c == 0) {
            a = (int) (8 + Math.random() * 10);
            b = (int) (4 + Math.random() * 7);
            c = (int) (1 + Math.random() * 3);
        }

        String outputResult = a + "x^2 + " + b + "x + " + c + " = 0";
        if (a == 0) {
            outputResult = outputResult.replaceAll("\\dx\\^2\\W+", "");
        Log.d("QQQ: ", outputResult);
        }
        if (b == 0) {
            outputResult = outputResult.replaceAll("(\\s*\\dx*)x\\s\\W+", "");
            Log.d("QQQ: ", outputResult);
        }
        if (c == 0)
            outputResult = a + "x^2 + " + b + "x" + " = 0" ;
        if (c == 1)
            outputResult = a + "x^2 + " + b + "x + " + c + " = 0";
        if (outputResult.contains("1")) {
            outputResult = outputResult.replaceFirst("1", "");
            if(outputResult.contains("1"))
                outputResult = outputResult.replaceFirst("1", "");
        }

        mathView.setText(MATH_ML_INSERT + outputResult + MATH_ML_INSERT);
    }

    public void updateClick(View view) {
        randomCoefficientQuadraticEquations();
    }
}