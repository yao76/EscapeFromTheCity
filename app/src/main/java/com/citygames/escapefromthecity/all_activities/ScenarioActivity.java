package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.world.Street;

public class ScenarioActivity extends AppCompatActivity
        implements View.OnClickListener
{
    Button Option_1,Option_2;
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
        //SETS STREET
            Helper.setStreet(this,toRender);
        //SETS STREET

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
            Helper.printStreet(livePlayer.playerPath.peek());

        //ROUTE TO END
        if(livePlayer.playerPath.peek() == null)
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

        //ROUTE TO END
        //ROUTE TO SPINNER
        }else if (livePlayer.playerPath.peek().isSpinner)
        {
            Intent intent = new Intent(this, SpinnerActivity.class);
            switch (v.getId())
            {
                case R.id.option_go_1:
                    Helper.pushStreet(this,Helper.getPlayer(this),Helper.getStreet(this).branch_left);
                    startActivity(intent);
                    break;
                case R.id.option_go_2:
                    Helper.pushStreet(this,Helper.getPlayer(this),Helper.getStreet(this).branch_right);
                    startActivity(intent);
                    break;
            }
        //ROUTE TO SPINNER
        }else if(livePlayer.playerPath.peek().isOption)
        {
            Intent intent = new Intent(this, OptionActivity.class);
            switch (v.getId())
            {
                case R.id.option_go_1:
                    Helper.pushStreet(this,Helper.getPlayer(this),Helper.getStreet(this).branch_left);
                    startActivity(intent);
                    break;
                case R.id.option_go_2:
                    Helper.pushStreet(this,Helper.getPlayer(this),Helper.getStreet(this).branch_right);
                    startActivity(intent);
                    break;
            }
        //ROUTE TO OPTION
        //CATCH ROUTE
        }else{

            Intent intent = new Intent(this, ScenarioActivity.class);
            switch (v.getId())
            {
                case R.id.option_go_1:
                    Helper.pushStreet(this,Helper.getPlayer(this),Helper.getStreet(this).branch_left);
                    startActivity(intent);
                    break;
                case R.id.option_go_2:
                    Helper.pushStreet(this,Helper.getPlayer(this),Helper.getStreet(this).branch_right);
                    startActivity(intent);
                    break;
            }
        }
        //CATCH ROUTE
    }
}
