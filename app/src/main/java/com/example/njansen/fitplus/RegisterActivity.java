package com.example.njansen.fitplus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        SharedPreferences prefNjan = getSharedPreferences("settings", 0);

        if (prefNjan.contains("registered") && prefNjan.getBoolean("registered", false)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            this.finish();
        } else {
            SharedPreferences.Editor mEditor = prefNjan.edit();
            mEditor.putBoolean("registered", false).apply();
        }
    }

    public void RegisterNjan(View view) {
        EditText firstNameText = (EditText) findViewById(R.id.etFirstNameNjan);
        String firstName = firstNameText.getText().toString();

        EditText lastNameText = (EditText) findViewById(R.id.etLastNameNjan);
        String lastName = lastNameText.getText().toString();

        SharedPreferences prefNjan = getSharedPreferences("settings", 0);

        SharedPreferences.Editor mEditor = prefNjan.edit();
        mEditor.putString("firstName", firstName).apply();
        mEditor.putString("lastName", lastName).apply();
        mEditor.putBoolean("registered", true).apply();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

}
