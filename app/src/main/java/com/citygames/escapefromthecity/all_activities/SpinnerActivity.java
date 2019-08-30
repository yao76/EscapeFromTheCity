package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

//LOCAL FOLDER FILE PATHING
import com.citygames.escapefromthecity.R;
import com.citygames.escapefromthecity.character.Player;
import com.citygames.escapefromthecity.item.Armory;
import com.citygames.escapefromthecity.item.Item;
//LOCAL FOLDER FILE PATHING
import com.citygames.escapefromthecity.world.Street;

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
            Player livePlayer = Helper.getPlayer(this);
            Street toCheck = livePlayer.playerPath.peek();

        //SPINNER CONSTRUCTOR FOR ITEMS
            Armory.MakeItems();
            spin_item = findViewById(R.id.item_spinner);
            List<String> list = new ArrayList<String>();
            for (Item item : Armory.allItems)
            {
                if (toCheck.button_right != null)
                {
                    if (item.isDumpster == true){list.add(item.title);}
                }
                if (toCheck.button_right == null)
                {
                    if (item.isDumpster == false){list.add(item.title);}
                }else{

                }
            }
            ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            itemAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin_item.setAdapter(itemAdapter);
        //SPINNER CONSTRUCTOR FOR ITEMS

        Choose = findViewById(R.id.submit_button);
        Choose.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        //GRAB PLAYER
        Player livePlayer = Helper.getPlayer(this);
        Street next = Helper.popStreet(this, livePlayer);
        Helper.printStreet(livePlayer.playerPath.peek());

        //ROUTE TO END
        if (livePlayer.playerPath.peek() == null)
        {
            Intent intent = new Intent(this, EndActivity.class);
            switch (v.getId()) {
                case R.id.submit_button:
                    startActivity(intent);
                    break;
            }

        //ROUTE TO END
        //SET PEAK TO VARIABLE FOR NAVIGATION
        //ROUTE TO OPTION
        }else if(livePlayer.playerPath.peek().isOption == true)
        {
            Intent intent = new Intent(this, OptionActivity.class);
            switch (v.getId())
            {
                case R.id.submit_button:
                    startActivity(intent);
                    break;
            }
        //ROUTE TO OPTION
        //ROUTE TO CATCH
        }else{


            Intent intent = new Intent(this, ScenarioActivity.class);
            switch (v.getId()) {
                case R.id.submit_button:
                    //ITEM SELECTED_title
                        String thisItem = spin_item.getSelectedItem().toString();
                    //GRAB ITEM FROM ALL ITEMS_using title
                        Armory.MakeItems();
                    for (Item toAdd : Armory.allItems)
                    {
                        if (toAdd.title == thisItem)
                        {
                            //HELPER TO ADD ITEM TO A PLAYER
                                Helper.itemPlayer(this,livePlayer,toAdd);
                        }
                    }
                    startActivity(intent);
                    break;
            }
        }
        //ROUTE TO CATCH



    }

}