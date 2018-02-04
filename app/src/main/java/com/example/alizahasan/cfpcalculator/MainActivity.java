package com.example.alizahasan.cfpcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

   private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** called when the user clicks on transportation routine. */
    public void introButtonPressed(View view) {
        button = (Button) findViewById(R.id.infoButton);
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    public void profileButtonPressed(View view) {
        button = (Button) findViewById(R.id.profileButton);
        startActivity(new Intent(this, ProfileActivity.class));
    }

    public void carbonFpButtonPressed(View view) {
        button = (Button) findViewById(R.id.carbonButton);
        startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
    }

    public void suggestionButtonPressed(View view) {
        button = (Button) findViewById(R.id.suggestButton);
        startActivity(new Intent(MainActivity.this, InfoActivity.class));
    }

    public void aboutusButtonPressed(View view) {
        startActivity(new Intent(MainActivity.this, InfoActivity.class));
    }
}
