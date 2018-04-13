package com.stariq.intermediate;

public class Car extends Vehicle{

    private boolean hasRooftop;
    private boolean hasStereo;
    private int wheels;

    public Car(String name, String colour, int seats, int passengers, boolean hasRooftop, boolean hasStereo, int wheels) {
        super(name, colour, seats, passengers, 4050);
        this.hasRooftop = hasRooftop;
        this.hasStereo = hasStereo;
        this.wheels = wheels;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(getName() + " is starting");
        super.accelerate(speed);
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is slowing");
        super.stop();
    }

    public void playMusic(){
        if(hasStereo){
            System.out.println("Playing music");
        } else {
            System.out.println("No stereo");
        }
    }

    public boolean isHasRooftop() {
        return hasRooftop;
    }

    public boolean isHasStereo() {
        return hasStereo;
    }

    public int getWheels() {
        return wheels;
    }
}
