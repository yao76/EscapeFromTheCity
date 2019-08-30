package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.citygames.escapefromthecity.R;

public class EndActivity extends AppCompatActivity
        implements View.OnClickListener
{
    Button Restart, Quit;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Restart = findViewById(R.id.restart);
        Restart.setOnClickListener(this);
        Quit = findViewById(R.id.quit);
        Quit.setOnClickListener(this);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.r2b2beep2);
        mp.start();
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        switch (v.getId())
        {
            case R.id.restart:
            case R.id.quit:
                startActivity(intent);
                break;
        }
    }
}
