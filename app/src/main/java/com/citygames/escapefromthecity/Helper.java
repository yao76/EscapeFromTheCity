package com.citygames.escapefromthecity;
//TO CUT DOWN CLUTTER

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class Helper extends AppCompatActivity
{
    public static void setPlayer(Context context, Player livePlayer)
    {
        SharedPreferences  mPrefs = context.getSharedPreferences("aString",Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(livePlayer);
        prefsEditor.putString("livePlayer", json);
        prefsEditor.commit();
    }

    public static Player getPlayer(Context context)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mPrefs.getString("livePlayer", "");
        Player livePlayer = gson.fromJson(json, Player.class);
        return livePlayer;
    }

    public static void itemPlayer(Context context, Player livePlayer, Item toAdd)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString", Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        livePlayer.inventory.add(toAdd);
        String return_json = gson.toJson(livePlayer);
        prefsEditor.putString("livePlayer", return_json);
        prefsEditor.commit();
    }

    //Todo: Cut down on clutter
    //Todo: Refactor preferences and get;set; for Player
    //Todo: Refactor for Layout recycling
    //Todo: Scenario Class
    //Todo: make more helper functions
    //Todo:stuff
}
