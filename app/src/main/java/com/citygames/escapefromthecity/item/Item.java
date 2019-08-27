package com.citygames.escapefromthecity.item;

public class Item {
    public String title;
    public int damage;

    public boolean isPoison;
    public boolean isIntelligent;
    public boolean isStrength;
    public boolean isDetermination;

    public boolean isDumpster;


    public  Item(String _title, int _damage)
    {
        title = _title;
        damage = _damage;
        isPoison = false;
        isIntelligent = false;
        isStrength = false;
        isDetermination = false;    }
}

