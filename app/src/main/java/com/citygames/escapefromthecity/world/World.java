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
                sesame.button_left = "Fifth Ave";
                sesame.button_right = "Counting Dojo";
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
                bag.button_right = null;
                bag.isSpinner = true;
                allPlaces.add(bag);

            Street counting_dojo = new Street("Counting Dojo");
                counting_dojo.flavorText = CountingDojoFlavor;
                counting_dojo.button_left = "End";
                counting_dojo.button_right = "Fifth Ave";
                allPlaces.add(counting_dojo);

            Street oscars_dump = new Street("Oscar's Dump");
                oscars_dump.flavorText = dump;


            Street baker = new Street("123 Baker Street");
                baker.flavorText = bakerFlavor;

            Street waldo = new Street("????");
                waldo.flavorText = waldoFlavor;
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
                deadCenter_option.button_left = stigwood.name;
                deadCenter_option.branch_right = sesame;
                deadCenter_option.button_right = sesame.name;

                stigwood.branch_right = fifthave;
                stigwood.button_left = fifthave.name;
                stigwood.branch_left = sesame;
                stigwood.button_right = sesame.name;

                fifthave.branch_left = waldo;
                fifthave.button_left = waldo.name;
                fifthave.branch_right = baker;
                fifthave.button_right = baker.name;

                waldo.branch_left = baker;
                waldo.button_left = baker.name;
                waldo.branch_right = null;
                waldo.button_right = "End";

                baker.button_left = oscars_dump.name;
                baker.branch_left = oscars_dump;
                baker.button_right = "End";
                baker.branch_right = null;

                sesame.button_right = counting_dojo.name;
                sesame.branch_right = counting_dojo;
                sesame.button_left = oscars_dump.name;
                sesame.branch_left = oscars_dump;

                counting_dojo.branch_left = null;
                counting_dojo.button_left = "End";
                counting_dojo.branch_right = fifthave;
                counting_dojo.button_right = fifthave.name;

                oscars_dump.branch_left = null;
                oscars_dump.button_left = "End";
                oscars_dump.branch_right = null;
                oscars_dump.button_right = "End";

                way_0.push(deadCenter);
                allPaths.add(way_0);
    }


    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    String defaultFlavor = "real flavor text would go here";

    String waldoFlavor =
            "It's Waldo......... \n" +
                    "he gave you a super sweet hat!!";

    String dump =
            "Oscar's dump truck was taken over by \n" +
                    "SKYNET!!!! \n" +
                    "Attacks you, you barely survived......";

    String bakerFlavor =
            "Sherlock Holmes told the police that \n" +
                    "you are the a suspect for a recent \n" +
                    "accounting scheme, went to jail....";

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

    String CountingDojoFlavor =
            "You have kick started your career in counting development by joining our counting bootcamp on Sesame Street. +2 to Intelligence" ;

    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS

}
