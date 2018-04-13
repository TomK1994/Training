package com.stariq.intermediate;

public class Ship extends Vehicle {

    private boolean canSiren;

    public Ship(String name, String colour, int seats, int passengers, boolean canSiren) {
        super(name, colour, seats, passengers, 10500);
        this.canSiren = canSiren;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(getName() + " is sailing");
        super.accelerate(speed);
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is reducing speed");
        super.stop();
    }

    public void start(){
        if(canSiren){
            System.out.println(getName() + " is going to start after siren signal");
        } else {
            System.out.println(getName() + " is going to start after announcement");
        }
    }

    public boolean isCanSiren() {
        return canSiren;
    }
}
