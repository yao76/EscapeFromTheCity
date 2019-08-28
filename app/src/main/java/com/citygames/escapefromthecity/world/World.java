package com.citygames.escapefromthecity.world;

import android.content.res.Resources;

import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.all_activities.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class World
{
    //Todo: P0 build out world class
    public List<Street> allPlaces;
    public List<Stack<Street>> allPaths;

    //FOR DEBUGGING
    public int bug;

    public World()
    {
        bug = Helper.randomInt(0,30);

        allPlaces = new ArrayList<Street>(){};

            //NON SPINNERS
            Street deadCenter = new Street("Dead Centa");
                deadCenter.flavorText = deadCenterFlavor;
                deadCenter.button_left = "Bag_tester";
                deadCenter.button_right = "Dumpster_tester";
                allPlaces.add(deadCenter);
                /*DEAD CENTER OPTIONS AFTER ITEM SELECTION*/
                Street deadCenter_option = new Street("Dead Centa Action");
                    deadCenter_option.flavorText = "SNAPDRAGONSSS";
                    deadCenter_option.button_left = "";
                    deadCenter_option.button_right = "Sesame";
                    deadCenter_option.isOption = true;
                    allPlaces.add(deadCenter_option);

            Street sesame = new Street("Sesame");
                sesame.flavorText = "I live in a trash can";
                sesame.button_left = "Big Birds House of Torture";
                sesame.button_right = "Elmo's Bath House";
                allPlaces.add(sesame);


            Street fifthave = new Street("fifthave");
                fifthave.flavorText="Heavy traffic on the roadway. Do you want to cross?";
                fifthave.button_left = "Yes";
                fifthave.button_right = "No";
                allPlaces.add(fifthave);
            //NON SPINNERS
            //SPINNERS
            Street weapon_select = new Street("Weapon Selection");
                allPlaces.add(weapon_select);
            Street elmo = new Street("Elmo's Gifts");
                    elmo.flavorText = deadCenterFlavor;
                    elmo.isSpinner = true;
                    allPlaces.add(elmo);
            //SPINNERS

        allPaths = new ArrayList<Stack<Street>>(){};
        Stack<Street> way_0 = new Stack<Street>(){};
                way_0.push(fifthave);
                way_0.push(sesame);
                way_0.push(deadCenter_option);
                way_0.push(elmo);
                way_0.push(deadCenter);
                allPaths.add(way_0);
    }


    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    String deadCenterFlavor =
            "        The Night was dark and full of terrors...........\n" +
                    "        \\n\n" +
                    "        You woke up in an alley.........\n" +
                    "        \\n\n" +
                    "        In a City kind of City...\n" +
                    "        \\n\n" +
                    "        Maniacal laughter in the background..";

    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS

}
