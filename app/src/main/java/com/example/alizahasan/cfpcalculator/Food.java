package com.example.alizahasan.cfpcalculator;

/**
 * Created by alizahasan on 2018-02-03.
 */

public class Food {
    private static double calories;
    private static final double foodEmition = 7.0;
    private static double carbonFootprint;


    public Food(){
        this(0.0);
    }

    public Food(double calories){
        this.calories = calories;
    }

    public static double Footprint(double calories){
        carbonFootprint = calories * 365 * foodEmition;
        return carbonFootprint;
    }
}
