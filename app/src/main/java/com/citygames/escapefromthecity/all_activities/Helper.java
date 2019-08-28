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

public abstract class Helper extends AppCompatActivity
{
    //PLAYER RELATED METHODS
    //PLAYER RELATED METHODS
    public static void setPlayer(Context context, Player livePlayer)
    {
        SharedPreferences  mPrefs = context.getSharedPreferences("aString",Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(livePlayer);
        String test = gson.toJson(gson);
        prefsEditor.putString("livePlayer", json);
        prefsEditor.commit();
        Log.d("butthole0",test);
        Log.d("butthole",gson.toJson(gson));
        Log.d("butthole2",json);

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
    //PLAYER RELATED METHODS
    //PLAYER RELATED METHODS

    //STREET RELATED METHODS
    //STREET RELATED METHODS
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
    //STREET RELATED METHODS
    //STREET RELATED METHODS

    //RANDOM INTEGER METHOD
        public  static int randomInt(int low, int high)
        {
            int result = (int)(Math.random()
                    * (high-low-1)) + low;
            return result;
        }
    //RANDOM INTEGER METHOD

    //GET STRING FOR STREET CONSTRUCTION


    //GET STRING FOR STREET CONSTRUCTION

    //Todo: Cut down on clutter
    //Todo: Refactor preferences and get;set; for Player
    //Todo: Refactor for Layout recycling
    //Todo: Scenario Class
    //Todo: make more helper functions
    //Todo:stuff
}
