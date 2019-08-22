package com.citygames.escapefromthecity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;//FOR BUTTONS
import android.widget.TextView;//FOR TEXT VIEW

public class MainActivity extends AppCompatActivity {
    Button Start;

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
        Start.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setContentView(R.layout.player_status);
                    Splash = findViewById(R.id.ViewSplash);
                    String toAdd = thisPlayer.Name + thisPlayer.Determination + thisPlayer.Intelligence;
                    Splash.setText(toAdd);
                }
            }
        );
        //START TO PLAYER SPLASH
    }
}
