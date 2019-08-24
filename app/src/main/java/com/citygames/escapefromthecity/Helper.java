package com.citygames.escapefromthecity;
//TO AID BUILD OF MAIN

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Helper extends AppCompatActivity
{

    public void changeContentView(int layout)
    {
        /* changeContentView(R.layout.toView) */
        setContentView(layout);
    }

    public void btn
        (
                //ARGUEMENTS
                Button locVar,
                int toView,
                int setString,
                final int layout
        )
        {
                //TO DO
            locVar = findViewById(toView);
            locVar.setText(getString(setString));
            locVar.setOnClickListener
                    (new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v) {
                                changeContentView(layout);
                            }
                        }
                    );

        }

}
