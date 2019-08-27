package com.citygames.escapefromthecity.world;

import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.world.EndPath;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class World
{
    //Todo: P0 build out world class
    public List<Street> allStreets;
    public List<Stack<Street>> allEndPaths;
    public int bug;

    public World()
    {
        bug = randomInt(0,30);

        allStreets = new ArrayList<Street>(){};
            Street deadCenter = new Street("Dead Center");
            deadCenter.flavorText = "Hello Street!!!!";
            deadCenter.button_left = "Bag_tester";
            deadCenter.button_right = "Dumpster_tester";
            allStreets.add(deadCenter);

            Street sesame = new Street("Sesame");
                sesame.flavorText = "I live in a trash can";
                sesame.button_left = "Big Birds House of Torture";
                sesame.button_right = "Elmo's Bath House";

        allEndPaths = new ArrayList<Stack<Street>>(){};
        Stack<Street> way_0 = new Stack<Street>(){};
                way_0.push(sesame);
                way_0.push(deadCenter);
            allEndPaths.add(way_0);
    }

    public  static int randomInt(int low, int high)
    {
        int result = (int)(Math.random()
                * (high-low-1)) + low;
        return result;
    }
}
