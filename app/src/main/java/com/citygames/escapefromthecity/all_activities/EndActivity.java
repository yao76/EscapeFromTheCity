package com.citygames.escapefromthecity.all_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.citygames.escapefromthecity.R;

public class EndActivity extends AppCompatActivity
        implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SpinnerActivity.class);
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
