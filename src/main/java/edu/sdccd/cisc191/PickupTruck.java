package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle{
    // instance variables
    private int cargoCapacity;

    // constructors
    public PickupTruck(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int cargoCapacity) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
        this.cargoCapacity = cargoCapacity;
    }

    // methods
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
