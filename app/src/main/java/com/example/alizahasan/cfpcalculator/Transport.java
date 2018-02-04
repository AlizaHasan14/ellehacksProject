package com.example.alizahasan.cfpcalculator;

/**
 * Created by alizahasan on 2018-02-03.
 */

public class Transport{
    // gasoline emits 8.91 kg of Co2 per gallon
    private static final double carEmission = 8.91;
    // CO2 emission per air travel is 0.254 kg CO2e per passenger mile
    private static final double airTravelEmission = 0.254;
    // public transport e.g. busses;
    private static final double busEmission = 0.055;
    private static double carCarbonFootprint;
    private static double airCarbonFootprint;
    private static double busCarbonFootprint;
    private static double CFP;
    private static double busDistance;
    private static double carDistance;
    private static double airDistance;
    public Transport(double airDistance, double busDistance, double carDistance) {
        this.airCarbonFootprint = 0;
        this.busCarbonFootprint = 0;
        this.carCarbonFootprint = 0;
        this.CFP = 0;
        //   this.distance = distance;
        this.airDistance = airDistance;
        this.busDistance = busDistance;
        this.carDistance = carDistance;
    }

    public static double getAirCarbonFootprint(double airdistance) {
        //Converting to tonnes
        airCarbonFootprint = (airdistance * 1.09 * airTravelEmission) / 1000;
        return airCarbonFootprint;
    }
    public static double getBusCarbonFootprint(double busDistance) {
        //converting to tonnes
        busCarbonFootprint = (busDistance * busEmission) / 1000;
        return busCarbonFootprint;
    }

    public static double getCarCarbonFootprint(double cardistance) {
        //converting to tonnes
        carCarbonFootprint = (cardistance * carEmission) / 1000;
        return carCarbonFootprint;
    }

    public static double calculateCFP(double air, double bus, double car) {
        CFP = getAirCarbonFootprint(air) + getBusCarbonFootprint(bus) + getCarCarbonFootprint(car);
        return CFP;
    }
//    public static void main(String[] args) {
//        Transportation t = new Transportation(10.0, 11.0, 12.0);
//        System.out.println(t.getBusCarbonFootprint(588.85));
//        System.out.println(t.getAirCarbonFootprint(588.85));
//        System.out.println(t.getCarCarbonFootprint(10));
//        System.out.println(t.getCFP());
//    }
}
