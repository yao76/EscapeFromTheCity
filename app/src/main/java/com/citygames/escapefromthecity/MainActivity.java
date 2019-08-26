package com.citygames.escapefromthecity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;//FOR BUTTONS
import android.widget.Spinner;
import android.widget.TextView;//FOR TEXT VIEW
import androidx.appcompat.app.AppCompatActivity;

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

        Armory.MakeItems();
        //PLAYER
        Start = findViewById(R.id.ViewStart);
        Start.setOnClickListener(this);
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
