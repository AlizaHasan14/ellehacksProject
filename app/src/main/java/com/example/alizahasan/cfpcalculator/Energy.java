package com.example.alizahasan.cfpcalculator;

/**
 * Created by alizahasan on 2018-02-03.
 */

public class Energy {
    private static final double elecEmition = 1.222;
    private static final double gasEmition = 0.00548;
    private static double elecEnergy;
    private static double gasEnergy;
    private static double carbonFootprint;

    //constructor

    public Energy(){
        this(0.0, 0.0);
    }

    public Energy(double elec, double gas){
        elecEnergy = elec;
        gasEnergy = gas;
        carbonFootprint = Footprint(elecEnergy, gasEnergy);
    }

    public static double Footprint(double elecEnergy, double gasEnergy){
        carbonFootprint = calElectricity(elecEnergy) + calGas(gasEnergy);
        return carbonFootprint;
    }

    public static double calElectricity(double energy){
        double elecFootprint;
        elecFootprint = energy * elecEmition;
        return elecFootprint;
    }

    public static double calGas(double energy){
        double gasFootprint;
        gasFootprint = energy * 0.0341296 * gasEmition;
        return gasFootprint;
    }
}
