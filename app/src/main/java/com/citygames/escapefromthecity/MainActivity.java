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
        Context context = this;
        SharedPreferences  mPrefs = context.getSharedPreferences("aString",Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(livePlayer);
        prefsEditor.putString("livePlayer", json);
        prefsEditor.commit();
        Log.d("json", json);
        String test = mPrefs.getString("livePlayer", "");
        Player craps = gson.fromJson(test, Player.class);
        Log.d("doDo", craps.Name);

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
