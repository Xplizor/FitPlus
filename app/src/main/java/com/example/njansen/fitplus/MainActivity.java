package com.example.njansen.fitplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private String[] strings = {"1", "2", "3", "4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.gvButtonsNjan);
        GridAdapterNjan gridAdapter = new GridAdapterNjan(this, strings);
        gridView.setAdapter(gridAdapter);
    }
}
