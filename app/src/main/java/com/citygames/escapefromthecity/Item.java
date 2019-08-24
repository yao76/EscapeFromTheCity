package com.citygames.escapefromthecity;
import java.util.ArrayList;
import java.util.List;

public class Item {
    public String title;
    public int damage;

    public boolean isPoison;
    public boolean isIntelligent;
    public boolean isStrength;
    public boolean isDetermination;


    public  Item(String _title, int _damage)
    {
        title = _title;
        damage = _damage;
        isPoison = false;
        isIntelligent = false;
        isStrength = false;
        isDetermination = false;    }
}

class Armory
{
    public static ArrayList<Item> allItems;

    public static void MakeItems()
    {
        allItems = new ArrayList<Item>(){};

        Item hand_axe = new Item("Hand Axe", 1);
            hand_axe.isStrength = true;
            allItems.add(hand_axe);
        Item book_insults = new Item("Book of Insults", 1);
            book_insults.isIntelligent = true;
            allItems.add(book_insults);
        Item dumpster_lid = new Item("Dumpster Lid", 5);
            dumpster_lid.isPoison = true;
            dumpster_lid.isStrength = true;
            dumpster_lid.isDetermination = true;
            allItems.add(dumpster_lid);
        Item blight_saber = new Item("Blight Saber", 1);
            blight_saber.isPoison = true;
            allItems.add(blight_saber);
        Item ice_pick = new Item("Ice Pick", 1);
            ice_pick.isDetermination = true;
            allItems.add(ice_pick);
        Item cake_dot_js = new Item("Cake.js", 20);
            allItems.add(cake_dot_js);
        Item book_algo = new Item("Algo Book", 1);
            book_algo.isIntelligent = true;
            allItems.add(book_algo);
    }
}
