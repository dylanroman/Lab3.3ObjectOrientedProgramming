package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable{
    // instance variables
    private int fuelLevel;
    private int batteryCharge;

    // constructors
    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        this.fuelLevel = 0;
        this.batteryCharge = 0;
    }

    //methods
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }

}
