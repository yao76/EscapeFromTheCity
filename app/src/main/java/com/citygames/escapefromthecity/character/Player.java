package com.citygames.escapefromthecity.character;

//CHILD OF CHARACTER

import com.citygames.escapefromthecity.all_activities.Helper;
import com.citygames.escapefromthecity.world.Street;

import java.util.Stack;

public class Player extends Character
{

    public Stack<Street> playerPath;

    //FOR DEBUGGING
    public int bug;

    public Player()
    {
        playerPath = new Stack<Street>(){};

        bug = Helper.randomInt(0,30);

    }
}
