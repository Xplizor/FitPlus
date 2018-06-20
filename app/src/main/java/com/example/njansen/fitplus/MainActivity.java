package com.example.njansen.fitplus;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button[] buttonsNjan = new Button[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsNjan[0] = new Button("Oefeningen", R.drawable.ic_excersie);
        buttonsNjan[1] = new Button("Instellingen", R.drawable.ic_settings);

        GridView gridView = (GridView)findViewById(R.id.gvButtonsNjan);
        final GridAdapterNjan gridAdapter = new GridAdapterNjan(this, buttonsNjan);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Button button = buttonsNjan[position];

                Context context = getApplicationContext();
                CharSequence text = button.titleNjan;
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, text, duration).show();

                // This tells the GridView to redraw itself
                // in turn calling your BooksAdapter's getView method again for each cell
                gridAdapter.notifyDataSetChanged();
            }
        });
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
