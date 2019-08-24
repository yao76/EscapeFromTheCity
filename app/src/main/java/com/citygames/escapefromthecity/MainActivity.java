package com.citygames.escapefromthecity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;//FOR BUTTONS
import android.widget.TextView;//FOR TEXT VIEW
import java.util.List;//FOR LISTS//FORLISTS

public class MainActivity extends AppCompatActivity {
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
        Armory.MakeItems();
        //PLAYER
        //START TO PLAYER SPLASH
        Start = findViewById(R.id.ViewStart);
        Start.setOnClickListener
                (new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         setContentView(R.layout.activity_start);
                         //Scenario 0 Actions
                         Option_1 = findViewById(R.id.option_go_1);
                         Option_1.setText(getString(R.string.scenario_option_1, "Obvious Place to look"));
                         Option_1.setOnClickListener
                                 (new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          setContentView(R.layout.option_1);
                                          TextView options;
                                          options = findViewById(R.id.viewOption);
                                            String theStuff = "";
                                            for(Item item : Armory.allItems ) {theStuff += item.title + "\n";}
                                            options.setText(getString(R.string.options, theStuff));

                                      }
                                  }
                                 );
                         Option_2 = findViewById(R.id.option_go_2);
                         Option_2.setText(getString(R.string.scenario_option_2, "Less Obvious place to look"));
                         Option_2.setOnClickListener
                                 (new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          setContentView(R.layout.option_1);
                                          TextView options;
                                          options = findViewById(R.id.viewOption);
                                          options.setText(getString(R.string.options,
                                                  "BlightSaber\n" +
                                                          "Canon\n" +
                                                          "Algo Book\n" +
                                                          "Javascript cake"));
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
