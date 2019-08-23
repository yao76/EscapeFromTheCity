package com.citygames.escapefromthecity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;//FOR BUTTONS
import android.widget.TextView;//FOR TEXT VIEW

public class MainActivity extends AppCompatActivity {
    Button Start,
            Option_1,
            Option_2;

    TextView Splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PLAYER
        final Player thisPlayer = new Player();
        //PLAYER
        //START TO PLAYER SPLASH
        Start = findViewById(R.id.ViewStart);
        Start.setOnClickListener
                (new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         setContentView(R.layout.player_status);
                     }
                 }
                );
        //START TO PLAYER SPLASH
        //Scenario 0 to Next Scenario
        Option_1 = findViewById(R.id.option_go_1);
        if (Option_1 != null) {
            Option_1.setOnClickListener
                    (new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             setContentView(R.layout.option_1);
                         }
                     }
                    );
        }
        Option_2 = findViewById(R.id.option_go_2);
        if (Option_2 != null)
        {
            Option_2.setOnClickListener
                    (new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             setContentView(R.layout.option_2);
                         }
                     }
                    );
        }
        //Scenario 0 to Next Scenario
    }
}
