package com.citygames.escapefromthecity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class ScenarioActivity extends AppCompatActivity
        implements View.OnClickListener
{

    Button Option_1,
            Option_2;
    String hidden_path;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario);
        Option_1 = findViewById(R.id.option_go_1);
        Option_1.setText(getString(R.string.scenario_option_1, "Dumpster"));
        Option_1.setOnClickListener(this);
        Option_2 = findViewById(R.id.option_go_2);
        Option_2.setText(getString(R.string.scenario_option_2, "Bag"));
        Option_2.setOnClickListener(this);
        hidden_path = getString(R.string.next_path);
        SharedPreferences  mPrefs = getSharedPreferences("aString",Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mPrefs.getString("livePlayer", "");
        Player livePlayer = gson.fromJson(json, Player.class);
        Log.d("Player", livePlayer.Name);
        if(!livePlayer.inventory.isEmpty())
        {
            Object WTF = livePlayer.inventory.toArray()[0];
            Log.d("ShonenJump","b");
            Log.d("Weapon", WTF.toString());
        }else{Log.d("WTF","Seriously though");}
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent(this, SpinnerActivity.class);
        switch (v.getId())
        {
            case R.id.option_go_1:
                startActivity(intent);
                break;
            case R.id.option_go_2:
                startActivity(intent);
                break;
        }
    }
}
