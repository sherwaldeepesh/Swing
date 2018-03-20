package com.example.utkar.swingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
    }

    public void onClick(View view) {
        Intent i = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(i);
    }

    public void youhaveclickedme(View view) {
        Intent i = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(i);
    }
}
