package com.citygames.escapefromthecity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;//FOR BUTTONS
import android.widget.Spinner;
import android.widget.TextView;//FOR TEXT VIEW
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{
    Button Start;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
        Start = findViewById(R.id.ViewStart);
        Start.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
            Intent intent = new Intent(this, ScenarioActivity.class);
            switch (v.getId())
            {
                case R.id.ViewStart:
                    startActivity(intent);
                    break;
            }
    }
}
