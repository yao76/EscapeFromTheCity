package com.citygames.escapefromthecity.all_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.character.NonPlayer;
import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.item.Armory;
import com.citygames.escapefromthecity.item.Item;
import com.citygames.escapefromthecity.world.Street;

public class FightActivity extends AppCompatActivity
    implements View.OnClickListener
{
    Button Attack, Run;
    TextView stats, flavor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        //GET ENEMY
        if(Helper.getEnemy(this) != null)
        {
            //TRY TO GRAB ENEMY
            NonPlayer robot_truck = Helper.getEnemy(this);
            //PUT ENEMY INTO SHARED PREFERENCES
            Helper.setEnemy(this,robot_truck);
            //PUT ENEMY INTO SHARED PREFERENCES
        }else{
            //MAKE ROBOT TRUCK
            NonPlayer robot_truck = new NonPlayer();
            //MAKE ROBOT TRUCK
            //PUT ENEMY INTO SHARED PREFERENCES
            Helper.setEnemy(this,robot_truck);
            //PUT ENEMY INTO SHARED PREFERENCES
        }
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
        flavor = findViewById(R.id.viewOption);
        flavor.setText(getString(R.string.viewFlavor, toRender.flavorText));
        //AKA FLAVOR TEXT
        //AKA FIGHT STATS
        stats = findViewById(R.id.ViewStats);
        String combStat = String.valueOf(livePlayer.Health + Helper.getEnemy(this).Health);
        stats.setText(getString(R.string.fight_stats, combStat));

        //AKA FIGHT STATS
        //AKA BUTTON LEFT
        Attack = findViewById(R.id.fight_button);
        Attack.setText(getString(R.string.action_option_1,toRender.button_left));
        Attack.setOnClickListener(this);
        //AKA BUTTON LEFT
        //AKA BUTTON RIGHT
        Run = findViewById(R.id.run_button);
        Run.setText(getString(R.string.action_option_1,toRender.button_right));
        Run.setOnClickListener(this);
        //AKA BUTTON RIGHT
    }

    @Override
    public void onClick(View v)
    {
        //GRAB PLAYER
        Player livePlayer = Helper.getPlayer(this);
        Street next = Helper.popStreet(this, livePlayer);


        //GRAB ENEMY

        NonPlayer enemy = Helper.getEnemy(this);

        //ROUTE TO FIGHT
        if (enemy.Health != 0) {
            Intent intent = new Intent(this, EndActivity.class);
            switch (v.getId()) {
                case R.id.fight_button:
                    livePlayer.Attack(enemy);
                    enemy.Attack(livePlayer);
                    startActivity(intent);
                    startActivity(intent);
                    break;

                case R.id.run_button:
                    startActivity(intent);
                    break;
            }
            //ROUTE TO FIGHT
            //ROUTE TO END
        } else if (livePlayer.playerPath.isEmpty()) {
            Intent intent = new Intent(this, EndActivity.class);
            switch (v.getId()) {
                case R.id.fight_button:
                    break;

                case R.id.run_button:
                    startActivity(intent);
                    break;
            }

            //ROUTE TO END
            //SET PEAK TO VARIABLE FOR NAVIGATION
            //ROUTE TO OPTION
        } else if (livePlayer.playerPath.peek().isOption == true) {
            Intent intent = new Intent(this, OptionActivity.class);
            switch (v.getId()) {
                case R.id.fight_button:
                    startActivity(intent);
                    break;
                case R.id.run_button:
                    startActivity(intent);
                    break;
            }
            //ROUTE TO OPTION
            //ROUTE TO CATCH
        } else {


            Intent intent = new Intent(this, ScenarioActivity.class);
            switch (v.getId()) {
                case R.id.fight_button:
                    startActivity(intent);
                    break;
                case R.id.run_button:
                    startActivity(intent);
                    break;
            }
        }
        //ROUTE TO CATCH
    }
}
