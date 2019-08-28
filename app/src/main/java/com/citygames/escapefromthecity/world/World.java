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
                deadCenter.button_left = "Bag_";
                deadCenter.button_right = "Dumpster";
                allPlaces.add(deadCenter);
                /* SEE SPINNERS FOR NEXT IN LINE */
                /*DEAD CENTER OPTIONS AFTER ITEM SELECTION*/
                Street deadCenter_option = new Street("Sesame -- Cosby");
                    deadCenter_option.flavorText = deadCenter_optionFlavor;
                    deadCenter_option.button_left = "Stigwood Ave";
                    deadCenter_option.button_right = "Sesame Str";
                    deadCenter_option.isOption = true;
                    allPlaces.add(deadCenter_option);

            Street sesame = new Street("Sesame");
                sesame.flavorText = sesameFlavor;
                sesame.button_left = "Big Birds House of Torture";
                sesame.button_right = "Elmo's Bath House";
                allPlaces.add(sesame);


            Street fifthave = new Street("fifthave");
                fifthave.flavorText= fifthaveFlavor;
                fifthave.button_left = "Yes";
                fifthave.button_right = "No";
                allPlaces.add(fifthave);

            Street  stigwood = new Street(" Stigwood Avenue");
                stigwood.flavorText = StigwoodFlavor;
                stigwood.button_left = "Fight Bill";
                stigwood.button_right = "Run (Become Cosby's waifu)";
                allPlaces.add(stigwood);
            //NON SPINNERS
            //SPINNERS
            Street dumpster = new Street("dumpster");
                    dumpster.flavorText = deadCenter_selectionFlavor;
                    dumpster.button_right = "dumpster";
                    dumpster.isSpinner = true;
                    allPlaces.add(dumpster);

            Street bag = new Street("bag");
                bag.flavorText = deadCenter_selectionFlavor;
                bag.isSpinner = true;
                allPlaces.add(bag);

            Street elmo = new Street("Elmo's Gifts");
                    elmo.flavorText = deadCenterFlavor;
                    elmo.isSpinner = true;
                    allPlaces.add(elmo);
            //SPINNERS

        allPaths = new ArrayList<Stack<Street>>(){};
        Stack<Street> way_0 = new Stack<Street>(){};
                deadCenter.branch_left = bag;
                deadCenter.branch_right = dumpster;

                dumpster.branch_left = deadCenter_option;
                dumpster.branch_right = deadCenter_option;

                bag.branch_left = deadCenter_option;
                bag.branch_right = deadCenter_option;

                deadCenter_option.branch_left = stigwood;
                deadCenter_option.branch_right = sesame;

                stigwood.branch_right = fifthave;

                sesame.branch_right = fifthave;

                way_0.push(deadCenter);
        allPaths.add(way_0);
    }


    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    String defaultFlavor = "real flavor text would go here";

    String deadCenterFlavor =
            "        The Night was dark and full of terrors...........\n" +
                    "        \n" +
                    "        You woke up in an alley.........\n" +
                    "        \n" +
                    "        In a City kind of City...\n" +
                    "        \n" +
                    "        Maniacal laughter in the background..";

        String deadCenter_selectionFlavor =
                "Select a weapon";

        String deadCenter_optionFlavor =
                "Wanna go down Sesame Street?" +
                        "\n or Stigwood Ave?";

    String sesameFlavor =
            "A street filled with...." +
                    "Truly bizzare characters" +
                    ".... addiction reigns supreme" +
                    "number, cookies, bath time";

    String fifthaveFlavor =
            "Heavy traffic on the roadway. Do you want to cross?";

    String  StigwoodFlavor =
            "House of Cosby's team Triosby";

    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS

}
