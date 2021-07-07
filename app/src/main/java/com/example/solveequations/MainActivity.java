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
        setMathViewRandomCoefficientQuadraticEquations();
    }

    private void setupMathView() {
        mathView = findViewById(R.id.mathView);
        mathView.setPixelScaleType(MathView.Scale.SCALE_SP);
        mathView.setTextSize(30);
        mathView.setTextColor("#3ecd5e");
    }

    private void setMathViewRandomCoefficientQuadraticEquations() {
        a = (int) (-5 + Math.random() * 5);
        b = (int) (-5 + Math.random() * 5);
        c = (int) (-5 + Math.random() * 5);

//        a = 0;
//        b = 0;
//        c = 0;

        String outputResult = "";

        // 1
        if ((a == 0 && b == 0 && c == 0)) {
            a = (int) (8 + Math.random() * 10);
            b = (int) (4 + Math.random() * 7);
            c = (int) (1 + Math.random() * 3);

            outputResult = a + "x^2 + " + b + "x + " + c + " = 0";

            Log.d("QQQ", "======================= VALUES 1 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 1 END =========================");
        }

        // 2
        else if (a == 0 && b == 0 && c != 0) {
            a = (int) (-8 + Math.random() * 10);
            b = (int) (-4 + Math.random() * 7);

            if (c < 0)
                outputResult = a + "x^2 + " + b + "x " + c + " = 0";
            else
                outputResult = a + "x^2 + " + b + "x + " + c + " = 0";

            Log.d("QQQ", "======================= VALUES 2 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 2 END =========================");
        }

        // 3
        else if (a == 0 && b != 0 && c == 0) {
            outputResult = b + "x" + " = 0";

            Log.d("QQQ", "======================= VALUES 3 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 3 END =========================");
        }

        // 4
        else if (a == 0 && b != 0 && c != 0) {
            if (c < 0)
                outputResult = b + "x " + c + " = 0";
            else
                outputResult = b + "x + " + c + " = 0";

            Log.d("QQQ", "======================= VALUES 4 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 4 END =========================");
        }

        // 5
        else if (a != 0 && b == 0 && c == 0) {
            outputResult = a + "x^2" + " = 0";

            Log.d("QQQ", "======================= VALUES 5 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 5 END =========================");
        }

        // 6
        else if (a != 0 && b == 0 && c != 0) {
            if (c < 0)
                outputResult = a + "x^2 " + c + " = 0";
            else
                outputResult = a + "x^2 + " + c + " = 0";

            Log.d("QQQ", "======================= VALUES 6 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 6 END =========================");
        }

        // 7
        else if (a != 0 && b != 0 && c == 0) {
            if (b < 0)
                outputResult = a + "x^2 " + b + "x" + " = 0";
            else
                outputResult = a + "x^2 + " + b + "x" + " = 0";

            Log.d("QQQ", "======================= VALUES 7 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 7 END =========================");
        }

        // 8
        else {
            if (b < 0 && c > 0)
                outputResult = a + "x^2 " + b + "x + " + c + " = 0";
            else if (b > 0 && c < 0)
                outputResult = a + "x^2 + " + b + "x " + c + " = 0";
            else if (b < 0 && c < 0)
                outputResult = a + "x^2 " + b + "x " + c + " = 0";
            else
                outputResult = a + "x^2 + " + b + "x + " + c + " = 0";

            Log.d("QQQ", "======================= VALUES 8 START =======================");
            Log.d("QQQ", "A = " + a);
            Log.d("QQQ", "B = " + b);
            Log.d("QQQ", "C = " + c);
            Log.d("QQQ", "VALUES = 1       ===       " + outputResult);
            Log.d("QQQ", "======================= VALUES 8 END =========================");
        }

        mathView.setText(MATH_ML_INSERT + outputResult + MATH_ML_INSERT);
    }

    public void updateClick(View view) {
        setMathViewRandomCoefficientQuadraticEquations();
    }
}