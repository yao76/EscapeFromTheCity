package com.citygames.escapefromthecity.character;

//CHILD OF CHARACTER

import android.os.Build;

import java.time.format.DateTimeFormatter;

import com.citygames.escapefromthecity.world.EndPath;
import com.citygames.escapefromthecity.world.Street;
import com.citygames.escapefromthecity.world.World;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Stack;

public class Player extends Character
{

    public World playerWorld;
    public Stack<Street> playerPath;
    public int bug;

    public Player()
    {
//        World toUse = new World(){};
//        playerWorld = toUse;
        playerPath = new Stack<Street>(){};

        Street deadCenter = new Street("Dead Center");
        deadCenter.flavorText = "Hello Street!!!!";
        deadCenter.button_left = "Bag_tester";
        deadCenter.button_right = "Dumpster_tester";

        Street sesame = new Street("Sesame");
        sesame.flavorText = "I live in a trash can";
        sesame.button_left = "Big Birds House of Torture";
        sesame.button_right = "Elmo's Bath House";

        playerPath.push(sesame);
        playerPath.push(deadCenter);


        bug = randomInt(0,30);

    }



    public  static int randomInt(int low, int high)
    {
        int result = (int)(Math.random()
                * (high-low-1)) + low;
        return result;
    }

}
