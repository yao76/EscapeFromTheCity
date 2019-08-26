package com.citygames.escapefromthecity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScenarioActivity extends AppCompatActivity
        implements View.OnClickListener
{

    Button Option_1,
            Option_2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario);
        Option_1 = findViewById(R.id.option_go_1);
        Option_1.setText(getString(R.string.scenario_option_1, "Dumpster"));
        Option_1.setOnClickListener(this);
        Option_2 = findViewById(R.id.option_go_2);
        Option_2.setText(getString(R.string.scenario_option_2, "Bag"));
        Option_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent(this, OptionActivity.class);
        switch (v.getId())
        {
            case R.id.option_go_1:
                startActivity(intent);
                break;
            case R.id.option_go_2:
                startActivity(intent);
                break;
        }
    }
}
