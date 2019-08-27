package com.citygames.escapefromthecity;
//TO AID BUILD OF MAIN

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Helper extends AppCompatActivity
{
    SharedPreferences mPrefs = getPreferences(MODE_PRIVATE);

    public void changeContentView(int layout)
    {
        /* changeContentView(R.layout.toView) */
        setContentView(layout);
    }

    //Todo: Cut down on clutter
    //Todo: Refactor preferences and get;set; for Player
    //Todo: Refactor for Layout recycling
    //Todo: Scenario Class
    //Todo: make more helper functions
}
