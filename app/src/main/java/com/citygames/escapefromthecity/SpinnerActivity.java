package com.citygames.escapefromthecity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends Activity
{
    Spinner spin_item;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        Armory.MakeItems();
        spin_item = findViewById(R.id.item_spinner);
        List<String> list = new ArrayList<String>();
        for(Item item : Armory.allItems){list.add(item.title);}

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        itemAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_item.setAdapter(itemAdapter);

    }


}