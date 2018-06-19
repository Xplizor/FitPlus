package com.example.njansen.fitplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private Button[] buttonsNjan = new Button[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsNjan[0] = new Button("Oefeningen", R.drawable.ic_excersie);
        buttonsNjan[1] = new Button("Instellingen", R.drawable.ic_settings);

        GridView gridView = (GridView)findViewById(R.id.gvButtonsNjan);
        GridAdapterNjan gridAdapter = new GridAdapterNjan(this, buttonsNjan);
        gridView.setAdapter(gridAdapter);
    }

    class Button {
        public String titleNjan = "";
        public int imageNjan = 0;

        Button(String title, int image) {
            titleNjan = title;
            imageNjan = image;
        }
    }
}
