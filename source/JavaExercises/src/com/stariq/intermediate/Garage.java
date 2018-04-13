package com.stariq.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void calculateBill(){

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getName() + " has value of £" + vehicle.getValue());
        }
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public void removeVehicle(String name){
        Vehicle vehicle = new Vehicle(name, "", 0,0,0.0);
        removeVehicle(vehicle);
    }

    public void fixVehicle(Vehicle vehicle){

        System.out.println(vehicle.getName() + " has a value + repairs of £" + vehicle.getValue() * 1.2);
    }

    public void emptyGarage(){
        vehicles.clear();
    }
}
