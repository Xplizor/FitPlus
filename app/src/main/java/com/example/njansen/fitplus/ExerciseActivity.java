package com.example.njansen.fitplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        TextView titleNjan = (TextView) findViewById(R.id.txvTitleNjan);
        TextView subTitleNjan = (TextView) findViewById(R.id.txvSubTitleNjan);
        TextView headNjan = (TextView) findViewById(R.id.txvHeadNjan);
        TextView exerciseNjan = (TextView) findViewById(R.id.txvExcerciseNjan);

        titleNjan.setText(R.string.ex1Title);
        subTitleNjan.setText(R.string.ex1SubTitle);
        headNjan.setText(R.string.ex1Head);
        exerciseNjan.setText(R.string.ex1Exercise);
    }

    public void CheckNjan(View view) {
        ImageView checkNjan = (ImageView) findViewById(R.id.imvCheckNjan);
        checkNjan.setImageResource(R.drawable.ic_checked);
    }
}
