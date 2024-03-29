package com.citygames.escapefromthecity.item;
//COLLECTION OF ITEMS

import java.util.ArrayList;

public class Armory
{
    public static ArrayList<Item> allItems;

    public static void MakeItems()
    {
        allItems = new ArrayList<Item>(){};

        Item hand_axe = new Item("Hand Axe", 1);
            hand_axe.isStrength = true;
            allItems.add(hand_axe);
        Item book_insults = new Item("Book of Insults", 1);
            book_insults.isDumpster = true;
            book_insults.isIntelligent = true;
            allItems.add(book_insults);
        Item dumpster_lid = new Item("Dumpster Lid", 5);
            dumpster_lid.isPoison = true;
            dumpster_lid.isStrength = true;
            dumpster_lid.isDetermination = true;
            dumpster_lid.isDumpster = true;
            allItems.add(dumpster_lid);
        Item blight_saber = new Item("Blight Saber", 1);
            blight_saber.isPoison = true;
            allItems.add(blight_saber);
        Item ice_pick = new Item("Ice Pick", 1);
            ice_pick.isDetermination = true;
            allItems.add(ice_pick);
        Item cake_dot_js = new Item("Cake.js", 20);
            cake_dot_js.isDumpster = true;
            allItems.add(cake_dot_js);
        Item book_algo = new Item("Algo Book", 1);
            book_algo.isIntelligent = true;
            allItems.add(book_algo);
    }
}
