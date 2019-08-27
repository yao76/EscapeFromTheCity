package com.citygames.escapefromthecity.world;

public class Street
{
    //Street properties
    public String name;
    public String flavorText;
    boolean isDifficult;
    //Street properties

    //Street Navigation properties
    public String button_left;
    public String button_right;
    //Street Navigation properties

    public Street(String ofStreet)
    {
        name = ofStreet;
        flavorText = "";
        isDifficult = false;
        button_left = "";
        button_right = "";
    }
}
