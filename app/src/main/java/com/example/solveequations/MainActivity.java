package com.example.solveequations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private MathView mathView;
    private EditText etAnswer1;
    private EditText etAnswer2;
    private TextView tvRes;

    private int a;
    private int b;
    private int c;

    private float x1, x2;
    private int count = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setupMathView();
        etAnswer1 = findViewById(R.id.etAnswer1);
        etAnswer2 = findViewById(R.id.etAnswer2);
        tvRes = findViewById(R.id.tvRes);

        tvRes.setText(Integer.toString(count));

        setMathViewRandomCoefficientQuadraticEquations();

        Button button = findViewById(R.id.btnCheck);

        button.setOnClickListener(v -> {
            checkAnswer();
            setMathViewRandomCoefficientQuadraticEquations();
        });
    }

    public void setupMathView() {
        mathView = findViewById(R.id.mathView);
        mathView.setPixelScaleType(MathView.Scale.SCALE_SP);
        mathView.setTextSize(30);
        mathView.setTextColor("#3ecd5e");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_manual:
                startActivity(new Intent(MainActivity.this, Manual.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setMathViewRandomCoefficientQuadraticEquations() {
//        a = (int) (-5 + Math.random() * 5);
//        b = (int) (-5 + Math.random() * 5);
//        c = (int) (-5 + Math.random() * 5);

        a = 1;
        b = -2;
        c = -4;

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

        mathView.setText("$$" + outputResult + "$$");
    }

    @SuppressLint("SetTextI18n")
    private void checkAnswer() {
        final int D = b * b - 4 * a * c;
        Log.d("WWW", "DISC = " + D);
        if (D < 0) {
            if (etAnswer1.getText().toString().isEmpty() && etAnswer2.getText().toString().isEmpty()) {
                count++;
                tvRes.setText(Integer.toString(count));
            } else {
                tvRes.setText("FALSE");
            }
        } else if (D == 0) {
            x1 = Math.round(((-b + Math.sqrt(D)) / (2 * a)) * 100 / 100.0);

            if ((Float.toString(x1).equals(etAnswer1.getText().toString()) && etAnswer2.getText().toString().isEmpty())
                    || (Float.toString(x1).equals(etAnswer2.getText().toString()) && etAnswer1.getText().toString().isEmpty())) {
                count++;
                tvRes.setText(Integer.toString(count));
            } else
                tvRes.setText("FALSE");

        } else if (D > 0 && !(etAnswer1.getText().toString().isEmpty() && etAnswer2.getText().toString().isEmpty())) {
            x1 = (float) (Math.round(((-b + Math.sqrt(D)) / (2 * a)) * 1000) / 1000.0);
            x2 = (float) (Math.round(((-b - Math.sqrt(D)) / (2 * a)) * 1000) / 1000.0);

            Log.d("WWW", "x1 = " + x1);
            Log.d("WWW", "x2 = " + x2);

            if (Float.toString(x1).equals(etAnswer1.getText().toString()) && Float.toString(x2).equals(etAnswer2.getText().toString())
                    || Float.toString(x1).equals(etAnswer2.getText().toString()) && Float.toString(x2).equals(etAnswer1.getText().toString())) {
                count++;
                tvRes.setText(Integer.toString(count));
            } else
                tvRes.setText("FALSE");
        } else {
            tvRes.setText("FALSE");
        }

        setMathViewRandomCoefficientQuadraticEquations();
    }
}