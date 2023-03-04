package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        Button btnMoveWithDataActivity = findViewById(R.id.btn_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);
        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
        Button btnProfile = findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_move_activity){
            Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
            startActivity(moveIntent);
        }else if (v.getId() == R.id.btn_activity_data){
            Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Natsu Dragneel");
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 20);
            startActivity(moveWithDataIntent);
        }else  if (v.getId() == R.id.btn_dial_number){
            String PhoneNumber = "081211820590";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("Phone :" + PhoneNumber));
            startActivity(dialPhoneIntent);
        }
        else if (v.getId() == R.id.btn_profile){
            Intent profileIntent = new Intent(MainActivity.this, profile.class);
            profile.putExtra(profile.EXTRA_NAME, "Panji");
            profile.putExtra(profile.EXTRA_GAME, "Dota 2");
        }

    }

}