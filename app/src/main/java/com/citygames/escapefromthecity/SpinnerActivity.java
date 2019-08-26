package com.citygames.escapefromthecity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity
    implements View.OnClickListener
{
    Spinner spin_item;
    Button Choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Player livePlayer;

        Armory.MakeItems();
        spin_item = findViewById(R.id.item_spinner);
        List<String> list = new ArrayList<String>();
        for (Item item : Armory.allItems) {
            list.add(item.title);
        }

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        itemAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_item.setAdapter(itemAdapter);

        Choose = findViewById(R.id.submit_button);
        Choose.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {
        if(spin_item.getSelectedItem() == "Dumpster Lid")
        {
            Intent intent = new Intent(this, OptionActivity.class);
            switch (v.getId())
            {
                case R.id.submit_button:
                    startActivity(intent);
                    break;
            }
        }else{


            Intent intent = new Intent(this, MainActivity.class);
            switch (v.getId()) {
                case R.id.submit_button:
                    startActivity(intent);
                    break;
            }
        }



    }

}