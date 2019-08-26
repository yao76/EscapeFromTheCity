package com.citygames.escapefromthecity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;//FOR BUTTONS
import android.widget.Spinner;
import android.widget.TextView;//FOR TEXT VIEW
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button Start,
            Option_1,
            Option_2;

    TextView Splash;

    String Test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PLAYER
        final Player livePlayer = new Player();
        NonPlayer bad_guy = new NonPlayer();
            bad_guy.Name = "Generic Bad Guy";
        NonPlayer good_guy = new NonPlayer();
            good_guy.Name = "Generic Good Guy";
        Armory.MakeItems();
        //PLAYER
//        btn(Start,R.id.ViewStart, R.string.health);
        //START TO PLAYER SPLASH
        Start = findViewById(R.id.ViewStart);
        Start.setOnClickListener
                (new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         setContentView(R.layout.activity_scenario);
                         //Scenario 0 Actions
                         Option_1 = findViewById(R.id.option_go_1);
                         Option_1.setText(getString(R.string.scenario_option_1, "Dumpster"));
                         Option_1.setOnClickListener
                                 (new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          setContentView(R.layout.activity_option);
                                          TextView options;
                                          options = findViewById(R.id.viewOption);
                                            String theStuff = "";
                                            for(Item item : Armory.allItems )
                                            {if(item.isDumpster == true){
                                                theStuff += item.title + "\n";}
                                                options.setText(getString(R.string.options, theStuff));
                                            }

                                      }
                                  }
                                 );
                         Option_2 = findViewById(R.id.option_go_2);
                         Option_2.setText(getString(R.string.scenario_option_2, "Bag"));
                         Option_2.setOnClickListener
                                 (new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          setContentView(R.layout.activity_option);
                                          TextView options;
                                          options = findViewById(R.id.viewOption);

                                      }
                                  }
                                 );
                         //Scenario 0 Actions
                     }
                 }
                );
        //START TO PLAYER SPLASH
    }
}
