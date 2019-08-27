package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//LOCAL FOLDER FILE PATHING
import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.item.Armory;
//LOCAL FOLDER FILE PATHING

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
