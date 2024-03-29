package com.citygames.escapefromthecity.character;

import com.citygames.escapefromthecity.item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    //Character PROPERTIES
    public String Name;
    public int Strength;
    public int Intelligence;
    public int Energy;
    public int Determination;
    public int Health;
    public int ActionPoints;

    public List<Item> inventory;
    //Character PROPERTIES
    //CONSTRUCTOR
    public  Character()
    {
        Name = "Billy";
        Strength = 15;
        Intelligence = 15;
        Energy = 100;
        Determination = 20;
        Health = 100;
        ActionPoints = 100;

        inventory = new ArrayList<Item>();
    }
    //CONSTRUCTOR
}
