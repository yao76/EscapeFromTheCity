package com.citygames.escapefromthecity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;//FOR BUTTONS
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;//FOR TEXT VIEW
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

//Todo: p0 refactor sharedPreferences

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{
    Button Start;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PLAYER
            Player livePlayer = new Player();
            Helper.setPlayer(this, livePlayer);
            Armory.MakeItems();
        //PLAYER
        //BUTTON TO LEAVE PAGE
            Start = findViewById(R.id.ViewStart);
            Start.setOnClickListener(this);
        //BUTTON TO LEAVE PAGE
    }

    @Override
    public void onClick(View v)
    {
            Intent intent = new Intent(this, ScenarioActivity.class);
            switch (v.getId())
            {
                case R.id.ViewStart:
                    startActivity(intent);
                    break;
            }
    }
}
