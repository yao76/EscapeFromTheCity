package com.citygames.escapefromthecity.world;

public class Street
{
    //STREET PROPERTIES
    public String name;
    public String flavorText;
    //STREET PROPERTIES

    //FOR BASIC ACTIVITY NAVIGATION
    public boolean isSpinner;
    public boolean isOption;

    //STREET NAVIGATION PROPERTIES
    public String button_left;
    public String button_right;
    //STREET NAVIGATION PROPERTIES

    public Street(String ofStreet)
    {
        name = ofStreet;
        flavorText = "";
        button_left = "";
        button_right = "";
        isSpinner = false;
        isOption = false;
    }
}
