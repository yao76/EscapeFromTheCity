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

public class OptionActivity extends AppCompatActivity
        implements View.OnClickListener
{
    Button Go1, Go2;
    TextView flavor;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        //GRAB PLAYER
        Player livePlayer = Helper.getPlayer(this);
        //POPS STREET FROM STACK TO GIVE LAYOUT FOR RENDER
        Street toRender = Helper.popStreet(this,livePlayer);
        //PUT PLAYER BACK
        Helper.setPlayer(this,livePlayer);

        //AKA FLAVOR TEXT
            flavor = findViewById(R.id.viewOption);
            flavor.setText(getString(R.string.viewFlavor, toRender.flavorText));
        //AKA FLAVOR TEXT
        //AKA BUTTON LEFT
            Go1 = findViewById(R.id.action_go_1);
            Go1.setText(getString(R.string.action_option_1,toRender.button_left));
            Go1.setOnClickListener(this);
        //AKA BUTTON LEFT
        //AKA BUTTON RIGHT
            Go2 = findViewById(R.id.action_go_2);
            Go2.setText(getString(R.string.action_option_1,toRender.button_right));
            Go2.setOnClickListener(this);
        //AKA BUTTON RIGHT
    }

    @Override
    public void onClick(View v)
    {
        //GET PLAYER
            Player livePlayer = Helper.getPlayer(this);

        //ROUTE TO END
        if(livePlayer.playerPath.isEmpty())
        {
            Intent intent = new Intent(this, EndActivity.class);
            switch (v.getId())
            {
                case R.id.action_go_1:
                    startActivity(intent);
                    break;
                case R.id.action_go_2:
                    startActivity(intent);
                    break;
            }
        }
        //ROUTE TO END
        //SET PEAK TO VARIABLE FOR NAVIGATION
            Street toCheck = livePlayer.playerPath.peek();
        //ROUTE TO SPINNER
        if(toCheck.isSpinner)
        {
            Intent intent = new Intent(this, SpinnerActivity.class);
            switch (v.getId())
            {
                case R.id.action_go_1:
                    startActivity(intent);
                    break;
                case R.id.action_go_2:
                    startActivity(intent);
                    break;
            }
        //ROUTE TO SPINNER
        //CATCH ROUTE
        }else{
            Intent intent = new Intent(this, ScenarioActivity.class);
            switch (v.getId())
            {
                case R.id.action_go_1:
                    startActivity(intent);
                    break;
                case R.id.action_go_2:
                    startActivity(intent);
                    break;
            }
        }
        //CATCH ROUTE
    }
}
