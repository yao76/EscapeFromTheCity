package com.citygames.escapefromthecity.world;

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
                deadCenter.button_left = "Drawstring Bag";
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

                Street fifthave_option_1 = new Street("Yes");
                    fifthave_option_1.isOption = true;
                    fifthave_option_1.flavorText = fifthave_option_1Flavor;

                Street fifthave_option_2 = new Street("No");
                    fifthave_option_2.isOption = true;
                    fifthave_option_2.flavorText = fifthave_option_2Flavor;

            Street  stigwood = new Street(" Stigwood Avenue");
                stigwood.flavorText = StigwoodFlavor;

                Street stigwood_talk = new Street("Talk to R2B2");
                    stigwood_talk.isOption = true;
                    stigwood_talk.flavorText = stigwood_talk_flavor;

                Street stigwood_ignore = new Street("Ignore R2B2");
                    stigwood_ignore.isOption = true;
                    stigwood_ignore.flavorText = stigwood_ignore_flavor;

            Street counting_dojo = new Street("Counting Dojo");
                counting_dojo.flavorText = CountingDojoFlavor;

            Street oscars_dump = new Street("Oscar's Dump");
                oscars_dump.flavorText = dump;


            Street baker = new Street("123 Baker Street");
                baker.flavorText = bakerFlavor;

            Street waldo = new Street("????");
                waldo.flavorText = waldoFlavor;

            Street shady = new Street("Shady");
                shady.flavorText = shadyFlavor;

                Street shady_insulin = new Street("Take insulin");
                    shady_insulin.flavorText = shady_insulin_Flavor;
                Street shady_ignore = new Street("Pretend nothing is wrong");
                    shady_ignore.flavorText = shady_ignore_Flavor;

            Street sunny = new Street("Sunny");
                sunny.flavorText = sunnyFlavor;

            //NON SPINNERS
            //SPINNERS
            Street dumpster = new Street("dumpster");
                    dumpster.flavorText = deadCenter_selectionFlavor;
                    dumpster.button_right = "dumpster";
                    dumpster.isSpinner = true;

            Street bag = new Street("bag");
                bag.flavorText = deadCenter_selectionFlavor;
                bag.button_right = null;
                bag.isSpinner = true;

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

                stigwood.branch_right = stigwood_talk;
                stigwood.button_right = stigwood_talk.name;
                stigwood.branch_left = stigwood_ignore;
                stigwood.button_left = stigwood_ignore.name;


                    stigwood_talk.branch_right = fifthave;
                    stigwood_talk.button_right = fifthave.name;
                    stigwood_talk.branch_left = sesame;
                    stigwood_talk.button_left = sesame.name;


                    stigwood_ignore.branch_right = waldo;
                    stigwood_ignore.button_right = waldo.name;
                    stigwood_ignore.branch_left = sesame;
                    stigwood_ignore.button_left = sesame.name;


                fifthave.branch_left = fifthave_option_1;
                fifthave.button_left = fifthave_option_1.name;
                fifthave.branch_right = fifthave_option_2;
                fifthave.button_right = fifthave_option_2.name;

                    fifthave_option_1.branch_left = null;
                    fifthave_option_1.button_left = "Died on Impact";
                    fifthave_option_1.branch_right = null;
                    fifthave_option_1.button_right = "Died on Impact";

                    fifthave_option_2.branch_left = sunny;
                    fifthave_option_2.button_left = sunny.name;
                    fifthave_option_2.branch_right = shady;
                    fifthave_option_2.button_right = shady.name;

                waldo.branch_left = baker;
                waldo.button_left = baker.name;
                waldo.branch_right = shady;
                waldo.button_right = shady.name;

                shady.branch_left = shady_ignore;
                shady.button_left = shady_ignore.name;
                shady.branch_right = shady_insulin;
                shady.button_right = shady_insulin.name;

                        shady_ignore.branch_left = null;
                        shady_ignore.button_left = "You Died of Diabetic Shock";
                        shady_ignore.branch_right = null;
                        shady_ignore.button_right = "You Died of Diabetic Shock";

                        shady_insulin.branch_left = sunny;
                        shady_insulin.button_left = sunny.name;
                        shady_insulin.branch_right = null;
                        shady_insulin.button_right = "End";

                baker.button_left = oscars_dump.name;
                baker.branch_left = oscars_dump;
                baker.button_right = "End";
                baker.branch_right = null;

                sesame.button_right = counting_dojo.name;
                sesame.branch_right = counting_dojo;
                sesame.button_left = oscars_dump.name;
                sesame.branch_left = oscars_dump;

                counting_dojo.branch_left = sunny;
                counting_dojo.button_left = sunny.name;
                counting_dojo.branch_right = fifthave;
                counting_dojo.button_right = fifthave.name;

                oscars_dump.branch_left = sunny;
                oscars_dump.button_left = sunny.name;
                oscars_dump.branch_right = null;
                oscars_dump.button_right = "End";

                sunny.button_right = "End";
                sunny.branch_right = null;
                sunny.button_left = "End";
                sunny.branch_left = null;

                way_0.push(deadCenter);
                allPaths.add(way_0);
    }


    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    String defaultFlavor = "real flavor text would go here";

    String fifthave_option_1Flavor =
            "You got hit by an angry grandma \n" +
                    "on a rascal \n" +
                    "Died on Impact";

    String fifthave_option_2Flavor =
            "An angry grandma on a rascal \n" +
                    "races by muttering about some sale.... \n" +
                    "Weird....";

    String sunnyFlavor =
            "You can see the End of the City!!";

    String shadyFlavor =
            "Some weirdo is selling stolen Twinkies.... \n" +
                    "You get addicted  \n" +
                    "Now you have diabetes";
        String shady_insulin_Flavor =
                "Hope they were worth it.";
        String shady_ignore_Flavor =
            "YOU DIED OF DIABETIC SHOCK!!!!!!";

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
                    "        You woke up in an alley.........\n" +
                    "        \n" +
                    "        In a City kind of City...\n" +
                    "        \n" +
                    "        For some reason, you feel magnetically drawn too \n" +
                            "a nearby dumpster and bag...";

        String deadCenter_selectionFlavor =
                "Select a weapon";

        String deadCenter_optionFlavor =
                "Wanna go down Sesame Street?" +
                        "\n or Stigwood Ave?";

    String sesameFlavor =
            "A street filled with.... \n" +
                    "Truly bizarre characters \n" +
                    ".... addiction reigns supreme \n" +
                    "numbers , cookies, bath time";

    String fifthaveFlavor =
            "Heavy traffic on the roadway. Do you want to cross?";

    String  StigwoodFlavor =
            "Cosby number 20 \n" +
                    "R2b2 is talking to you";

        String stigwood_talk_flavor =
                "Bleep bloop \n" +
                        "bloop bloop \n" +
                        "BLEEEEP!!!!!\n" +
                        "\n....... wtf";

        String stigwood_ignore_flavor =
                "***Angrily*** \n" +
                        "Bleep bloop \n" +
                        "bloop bloop \n" +
                        "BLEEEEP!!!!!\n";

    String CountingDojoFlavor =
            "You have kick started your career in counting development by joining our counting bootcamp on Sesame Street. +2 to Intelligence" ;

    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS
    //GIANT LIST OF FLAVOR STRINGS

}
