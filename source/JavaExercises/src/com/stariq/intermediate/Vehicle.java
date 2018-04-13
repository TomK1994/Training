package com.stariq.intermediate;

public class Vehicle {

    private String name;
    private String colour;
    private int seats;
    private int passengers;
    private double value;

    public Vehicle(String name, String colour, int seats, int passengers, double baseValue) {
        this.name = name;
        this.colour = colour;
        this.seats = seats;
        this.passengers = passengers;
        this.value = baseValue + (seats * 10.12);
    }

    public void accelerate(int speed){
        System.out.println(getName() + " is speeding at " + speed + "mph");
    }

    public void stop(){
        System.out.println(getName() + " is stopping");
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getSeats() {
        return seats;
    }

    public int getPassengers(){
        return passengers;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || !(obj instanceof Vehicle)){
            return false;
        }
        Vehicle vehicle = (Vehicle)obj;
        if(getName().equalsIgnoreCase(vehicle.getName())){
            return true;
        }
        return false;
    }
}
