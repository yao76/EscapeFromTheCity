package com.citygames.escapefromthecity;

public class Player {
    //PLAYER PROPERTIES
    public String Name;
    public int Strength;
    public int Intelligence;
    public int Energy;
    public int Determination;
    public int Health;
    //PLAYER PROPERTIES
    //CONSTRUCTOR
    public  Player()
    {
        Name = "Billy";
        Strength = 15;
        Intelligence = 15;
        Energy = 100;
        Determination = 20;
        Health = 100;
    }

    public  Player(String name)
    {
        Name = name;
        Strength = 15;
        Intelligence = 15;
        Energy = 100;
        Determination = 20;
        Health = 100;
    }
    //CONSTRUCTOR
    //PLAYER METHODS
    public void getsAttacked(Player thisPlayer)
    {
        thisPlayer.Health -= 50;
    }
    //PLAYER METHODS
}
