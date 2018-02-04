package com.example.alizahasan.cfpcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    public void cfpButtonPressed(View view) {
        startActivity(new Intent(CalculatorActivity.this, CalculatorActivity.class));
        View text = findViewById(R.id.text);
        View textView2 = findViewById(R.id.textView2);
        View electricity = findViewById(R.id.electricity);
        View gas = findViewById(R.id.gas);
        CheckBox airplaneCheckBox = (CheckBox) findViewById(R.id.airplaneCheckBox);
        CheckBox busCheckBox = (CheckBox) findViewById(R.id.busCheckBox);
        CheckBox carCheckBox = (CheckBox) findViewById(R.id.carCheckBox);

        EditText elec = (EditText) findViewById(R.id.electricityTextbox);
        Double elecEnergy = Double.parseDouble(elec.getText().toString());

        EditText gasE = (EditText) findViewById(R.id.gasTextBox);
        Double gasEnergy = Double.parseDouble(gasE.getText().toString());

        EditText plane = (EditText) findViewById(R.id.airplaneTextBox);
        Double planeEnergy = Double.parseDouble(plane.getText().toString());

        EditText bus = (EditText) findViewById(R.id.busTextBox);
        Double busEnergy = Double.parseDouble(bus.getText().toString());

        EditText car = (EditText) findViewById(R.id.carTextBox);
        Double carEnergy = Double.parseDouble(car.getText().toString());

        EditText food = (EditText) findViewById(R.id.foodTextBox);
        Double foodEnergy = Double.parseDouble(food.getText().toString());

        double answer = Energy.Footprint(elecEnergy, gasEnergy) + Transport.calculateCFP(planeEnergy, busEnergy, carEnergy) + Food.Footprint(foodEnergy);
        String ans = Double.toString(answer);
        TextView tview = (TextView)findViewById(R.id.answerButton);
        tview.setText(ans);
    }



}
