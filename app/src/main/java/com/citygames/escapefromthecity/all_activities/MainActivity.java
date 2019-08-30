package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//LOCAL FOLDER FILE PATHING
import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.item.Armory;
import com.citygames.escapefromthecity.world.World;

import java.io.IOException;
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
        //WORLD
            World thisWorld = new World(){};
        //WORLD
        //PLAYER
            Player livePlayer = new Player();
            livePlayer.playerPath = thisWorld.allPaths.get(0);
            Helper.setPlayer(this, livePlayer);
            Armory.MakeItems();
        //PLAYER

        // WHAT THE FUCK WHY IS THIS NOT WORKING ANYMORE






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
