package com.citygames.escapefromthecity.all_activities;
//TO CUT DOWN CLUTTER

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.item.Item;
import com.citygames.escapefromthecity.world.Street;
import com.google.gson.Gson;

public class Helper extends AppCompatActivity
{
    //PLAYER RELATED METHODS
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

    public static Street popStreet(Context context, Player livePlayer)
    {
        SharedPreferences mPrefs = context.getSharedPreferences("aString", Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        Street toRender = livePlayer.playerPath.pop();
        String return_json = gson.toJson(livePlayer);
        prefsEditor.putString("livePlayer", return_json);
        prefsEditor.commit();
        Log.wtf("In Pop", return_json);
        return toRender;
    }
    //PLAYER RELATED METHODS
    //SPINNER RELATED METHODS
    public static void mkSpin()
    {

    }
    //SPINNER RELATED METHODS
    //GET STRING FOR STREET CONSTRUCTION
    public String find(int toFind)
    {
        String stringFound = getString(toFind);
        return stringFound;
    }
    //GET STRING FOR STREET CONSTRUCTION
    //Todo: Cut down on clutter
    //Todo: Refactor preferences and get;set; for Player
    //Todo: Refactor for Layout recycling
    //Todo: Scenario Class
    //Todo: make more helper functions
    //Todo:stuff
}
