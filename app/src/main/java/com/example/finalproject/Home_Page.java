package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        this.setTitle("Home");
    }

    public void DonateFunction(View view) {

        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }

    public void DonateListFunction(View view) {

        Intent myIntent=new Intent(this,DetailsActivity.class);
        startActivity(myIntent);
    }
}