package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.citygames.escapefromthecity.R;

public class OptionActivity extends AppCompatActivity
        implements View.OnClickListener
{
    Button Go1, Go2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        Go1 = findViewById(R.id.action_go_1);
        Go1.setText(getString(R.string.action_option_1,"Left"));
        Go1.setOnClickListener(this);
        Go2 = findViewById(R.id.action_go_2);
        Go2.setText(getString(R.string.action_option_1,"Right"));
        Go2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if("Dumpster Lid" == "Dumpster Lid")
        {
            Intent intent = new Intent(this, SpinnerActivity.class);
            switch (v.getId())
            {
                case R.id.action_go_1:
                    startActivity(intent);
                    break;
                case R.id.action_go_2:
                    startActivity(intent);
                    break;
            }
        }else{
            Intent intent = new Intent(this, SpinnerActivity.class);
            switch (v.getId())
            {
                case R.id.action_go_1:
                    startActivity(intent);
                    break;
            }
        }
    }

}