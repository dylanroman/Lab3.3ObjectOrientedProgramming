package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable{
    // instance variables
    int batteryCharge;

    // constructors
    public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        this.batteryCharge = 0;
    }

    // methods
    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }
}
