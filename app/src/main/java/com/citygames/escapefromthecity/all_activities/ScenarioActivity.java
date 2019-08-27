package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.world.Street;
import com.citygames.escapefromthecity.world.EndPath;

public class ScenarioActivity extends AppCompatActivity
        implements View.OnClickListener
{

    Button Option_1,
            Option_2;
    TextView flavor;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario);

        Player livePlayer = Helper.getPlayer(this);
//        Log.wtf("Before",livePlayer.playerPath.toString());
//        Log.wtf("BeforeBug", String.valueOf(livePlayer.bug));
//        Log.wtf("BeforeTag", String.valueOf(livePlayer.playerPath));
//        Log.wtf("BeforeWorld", String.valueOf(livePlayer.playerWorld.bug));
        Street toRender = Helper.popStreet(this,livePlayer);
//        Log.wtf("After",livePlayer.playerPath.toString());


        Helper.setPlayer(this,livePlayer);
//        Log.wtf("Crayyy",livePlayer.playerPath.peek().toString());

        flavor = findViewById(R.id.ViewScenario);
        flavor.setText(getString(R.string.viewFlavor, toRender.flavorText));
        Option_1 = findViewById(R.id.option_go_1);
        Option_1.setText(getString(R.string.scenario_option_1, toRender.button_left));
        Option_1.setOnClickListener(this);
        Option_2 = findViewById(R.id.option_go_2);
        Option_2.setText(getString(R.string.scenario_option_2, toRender.button_right));
        Option_2.setOnClickListener(this);

        Log.d("Player", livePlayer.Name);
        if(!livePlayer.inventory.isEmpty())
        {
            Object WTF = livePlayer.inventory.toArray()[0];
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
