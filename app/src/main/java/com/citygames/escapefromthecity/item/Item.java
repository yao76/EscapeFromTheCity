package com.citygames.escapefromthecity.item;

import com.citygames.escapefromthecity.all_activities.Helper;

public class Item
{
    public String title;
    public int damage;

    public boolean isPoison;
    public boolean isIntelligent;
    public boolean isStrength;
    public boolean isDetermination;

    //FOR STARTING POSITION
    public boolean isDumpster;

    //FOR DEBUGGING
    public int bug;


    public  Item(String _title, int _damage)
    {
        title = _title;
        damage = _damage;
        isPoison = false;
        isIntelligent = false;
        isStrength = false;
        isDetermination = false;
        isDumpster = false;

        bug = Helper.randomInt(0,30);
    }
}

