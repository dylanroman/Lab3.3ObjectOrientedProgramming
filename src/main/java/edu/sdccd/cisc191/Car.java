package edu.sdccd.cisc191;

public class Car extends Vehicle{
    // instance variables
    private int numberOfDoors;

    // constructors
    public Car (String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super (manufacturerName, milesOnVehicle, price, numberOfSeats, options);
        this.numberOfDoors = numberOfDoors;
    }

    // methods
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
