package com.citygames.escapefromthecity.character;

//CHILD OF CHARACTER

public class Player extends Character
{
    //PLAYER METHODS
    public void getsAttacked(Player thisPlayer)
    {
        thisPlayer.Health -= 50;
    }
    //PLAYER METHODS
}
