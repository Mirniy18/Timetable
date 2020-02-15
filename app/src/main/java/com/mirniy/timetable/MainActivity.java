package com.mirniy.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int screenWidth, screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;

        ConstraintLayout layout = new ConstraintLayout(this);

        layout.setBackgroundColor(Color.BLACK);

        TextView[] textViews = new TextView[8];

        int textViewHeight = -1;

        for (int i = 0; i < textViews.length; ++i) {
            textViews[i] = addLabel("Label " + i, layout);

            if (i == 0) {
                textViews[i].setX(128);
                textViews[i].setY(64);

                textViews[i].measure(0, 0);
                textViewHeight = textViews[i].getMeasuredHeight();
            } else {
                textViews[i].setX(128);
                textViews[i].setY(textViews[i - 1].getY() + textViewHeight);
            }
        }

        setContentView(layout, new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    private TextView addLabel(String text, ConstraintLayout layout) {
        TextView textView = new TextView(this);

        textView.setText(text);
        textView.setTextColor(Color.WHITE);

        textView.setId(View.generateViewId());

        layout.addView(textView);

        return textView;
    }
}
