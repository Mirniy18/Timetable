package com.mirniy.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView day = findViewById(R.id.week_day);

        TextView c0 = findViewById(R.id.couple_0);
        TextView c1 = findViewById(R.id.couple_1);
        TextView c2 = findViewById(R.id.couple_2);
        TextView c3 = findViewById(R.id.couple_3);
        TextView c4 = findViewById(R.id.couple_4);
        TextView c5 = findViewById(R.id.couple_5);
        TextView c6 = findViewById(R.id.couple_6);
        TextView c7 = findViewById(R.id.couple_7);

        Button list = findViewById(R.id.list_btn);



//        ConstraintLayout layout = new ConstraintLayout(this);
//
//        TextView textView = new TextView(this);
//
//        textView.setText("Test");
//
//        layout.addView(textView);
//
//        textView.setId(0);
//
//        ConstraintSet constraintSet = new ConstraintSet();
//
//        constraintSet.clone(layout);
//        constraintSet.connect(textView.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 16);
////        constraintSet.connect(textView.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 16);
//        constraintSet.connect(textView.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 64);
////        constraintSet.connect(textView.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 16);
//        constraintSet.applyTo(layout);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
//
//        setContentView(layout, layoutParams);
    }
}
