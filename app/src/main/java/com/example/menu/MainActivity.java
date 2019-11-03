package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Launch activity inside the app through the menu
        Button settings = findViewById(R.id.settings);
        Button startGame = findViewById(R.id.startGame);

        settings.setOnClickListener(this);
        startGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.settings:
                Intent settings = new Intent(this, SettingActivity.class);
                startActivity(settings);
                break;
            case R.id.startGame:
                Intent game = new Intent(this, SettingActivity.class);
                startActivity(game);
                break;
        }
    }
}
