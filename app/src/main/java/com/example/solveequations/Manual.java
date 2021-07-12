package com.example.solveequations;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Manual extends AppCompatActivity {

    private MathView mathView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_activity);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //
        String str = "<p align=left>Если уравнение имеет только одно решение, то ответ можно писать как в $$x_1$$, " +
                "        так и в $$x_2$$. Ошибки не будет. Если уравнение НЕ имеет решений во множестве дейтсвительных " +
                "        чисел ℝ, то оставьте поля ввода $$x_1$$ и $$x_2$$ пустыми и нажмите на кнопку “ПРОВЕРИТЬ”.\n" +
                "        Если уравнение имеет два корня решения, то порядок ввода не имеет смысла. Например, в коде\n" +
                "        $$x_1 = {-b+√D}/{2a}$$\n" +
                "        $$x_2 = {-b-√D}/{2a}$$\n" +
                "        Вы можете в $$x_1$$ записать ответ для $$x_2$$ и наоборот. Ошибки не будет.\n" +
                "        Если корни не целочисленные, то ответ нужно вводить округленно до сотой части.\n" +
                "        Например,\n" +
                "        $$x_1$$ = 0.12345\n" +
                "        $$x_2$$ = -0.54321\n" +
                "        Округленно до сотой части будет\n" +
                "        $$x_1$$ = 0.12\n" +
                "        $$x_2$$ = -0.54</p>";

        setupMathView();
        mathView.setText(getString(R.string.manual));
        //mathView.setText(str);

    }

    public void setupMathView() {
        mathView = findViewById(R.id.mathView);
        mathView.setPixelScaleType(MathView.Scale.SCALE_SP);
        mathView.setTextSize(16);
        mathView.setTextColor("#3ecd5e");

//        String color = "#" + Integer.toHexString(getResources().getColor(R.color.green));
//
//        mathView.setTextColor(color);
    }
}
