package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_GAME = "extra_game";

    public static void putExtra(String extraName, String panji) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView tvA = findViewById(R.id.tv_a);
        
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String game = getIntent().getStringExtra(EXTRA_GAME);
        
        String text = "Nama :" + name + "\nYour Game :" + game;
        tvA.setText(text);

    }
}