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
import com.google.gson.Gson;

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
        //GRAB PLAYER
        Player livePlayer = Helper.getPlayer(this);
        //POPS STREET FROM STACK TO GIVE LAYOUT FOR RENDER
        Street toRender = Helper.popStreet(this,livePlayer);
        //PUT PLAYER BACK
        Helper.setPlayer(this,livePlayer);

        //AKA FLAVOR TEXT
            flavor = findViewById(R.id.ViewScenario);
            flavor.setText(getString(R.string.viewFlavor, toRender.flavorText));
        //AKA FLAVOR TEXT
        //AKA BUTTON LEFT
            Option_1 = findViewById(R.id.option_go_1);
            Option_1.setText(getString(R.string.scenario_option_1, toRender.button_left));
            Option_1.setOnClickListener(this);
        //AKA BUTTON LEFT
        //AKA BUTTON RIGHT
            Option_2 = findViewById(R.id.option_go_2);
            Option_2.setText(getString(R.string.scenario_option_2, toRender.button_right));
            Option_2.setOnClickListener(this);
        //AKA BUTTON RIGHT
    }

    @Override
    public void onClick(View v)
    {
        //GET PLAYER
        Player livePlayer = Helper.getPlayer(this);
        //SET PEAK TO VARIABLE FOR NAVIGATION
        Street toCheck = livePlayer.playerPath.peek();
        Gson gson = new Gson();
        String checker = gson.toJson(toCheck);
        Log.d("Before Scenario", checker);

        Boolean is = livePlayer.playerPath.isEmpty();

        Log.d("Empty1", is.toString());

        //ROUTE TO END
        if(livePlayer.playerPath.isEmpty())
        {
            Intent intent = new Intent(this, EndActivity.class);
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
        //ROUTE TO END
        //ROUTE TO SPINNER
        if(toCheck.isSpinner == true)
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
        //ROUTE TO SPINNER
        //CATCH ROUTE
        }else{

            Intent intent = new Intent(this, ScenarioActivity.class);
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
        //CATCH ROUTE
    }
}
