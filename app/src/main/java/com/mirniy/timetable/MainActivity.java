package com.mirniy.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout = new ConstraintLayout(this);

        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);

        textView1.setText("Test1");
        textView2.setText("Test2");

        layout.addView(textView1);
        layout.addView(textView2);

        textView1.setId(View.generateViewId());
        textView2.setId(View.generateViewId());

        ConstraintSet constraintSet = new ConstraintSet();

        constraintSet.clone(layout);
        constraintSet.connect(textView1.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 16);
//        constraintSet.connect(textView1.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 16);
        constraintSet.connect(textView1.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 64);
//        constraintSet.connect(textView1.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 16);
        constraintSet.applyTo(layout);


        constraintSet = new ConstraintSet();

        constraintSet.clone(layout);
        constraintSet.connect(textView2.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 24);
//        constraintSet.connect(textView1.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 16);
        constraintSet.connect(textView2.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 80);
//        constraintSet.connect(textView1.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 16);
        constraintSet.applyTo(layout);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);

        setContentView(layout, layoutParams);
    }
}
