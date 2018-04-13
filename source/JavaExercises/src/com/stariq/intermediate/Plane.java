package com.stariq.intermediate;

public class Plane extends Vehicle{

   private boolean isFlying;
   private int wings;

    public Plane(String name, String colour, int seats, int passengers, boolean isFlying, int wings) {
        super(name, colour, seats, passengers, 25600);
        this.isFlying = isFlying;
        this.wings = wings;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(getName() + " is taking off");
        super.accelerate(speed);
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is landing");
        super.stop();
    }

    public void fly(){
        if(isFlying){
            System.out.println(getName() + " is flying");
        } else {
            System.out.println(getName() + " is not flying");
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public int getWings() {
        return wings;
    }
}
