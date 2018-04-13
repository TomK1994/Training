package com.stariq.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Intermediate {

    static List<Person> people = new ArrayList<Person>();

    public Intermediate() {

        System.out.println("\n***INTERMEDIATE***\n");

        // Blackjack
        System.out.println("-- Using blackjack --");
        System.out.print(blackjack(18,21) + " ");
        System.out.print(blackjack(20,18) + " ");
        System.out.print(blackjack(22,22) + "\n");

        // Unique sum
        System.out.println("-- Using unique sum --");
        System.out.print(uniqueSum(1,2,3) + " ");
        System.out.print(uniqueSum(3,3,3) + " ");
        System.out.print(uniqueSum(1,1,2) + "\n");

        // Too hot
        System.out.println("-- Using too hot --");
        System.out.print(tooHot(89,false) + " ");
        System.out.print(tooHot(96, true) + " ");
        System.out.println(tooHot(56,true));

        // People
        System.out.println("-- Using Person class --");
        Person emma = new Person("Emma", 16,"Student");
        Person john = new Person("John", 22, "Developer");
        Person kat = new Person("Kat", 30,"Manager");
        people.add(emma);
        people.add(john);
        people.add(kat);
        for(Person person : people){
            System.out.println(person.toString());
        }
        searchObject("Emma");
        searchObject("john");
        searchObject("Tom");

        // Garage
        System.out.println("-- Using Garage class --");

        Vehicle c1 = new Car("C1", "Blue", 4,3,true,false,4);
        Vehicle ford = new Car("Ford", "Red", 5,4,true,true,4);
        Vehicle rms = new Ship("RMS", "Beige", 536,367,true);
        Vehicle titanic = new Ship("Titanic","White", 89,67,false);
        Vehicle g6 = new Plane("G6", "Black", 234,145,true,4);
        Vehicle jetblue = new Plane("Jetblue","Purple", 156,65,false,2);

        Garage garage = new Garage();

        garage.addVehicle(g6);
        garage.addVehicle(jetblue);

        garage.emptyGarage();

        garage.addVehicle(c1);
        garage.addVehicle(ford);
        garage.addVehicle(rms);
        garage.addVehicle(titanic);

        garage.removeVehicle("c1");
        garage.removeVehicle(rms);

        System.out.println("Value including repairs: ");
        garage.fixVehicle(titanic);
        garage.fixVehicle(ford);

        System.out.println("Value of vehicles:");
        garage.calculateBill();

    }

    public boolean searchObject(String name){

        for(Person person : people){
            if(person.getName().equalsIgnoreCase(name)){
                System.out.println("Found: " + person.getName());
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public int blackjack(int numberOne, int numberTwo){

        int differenceOne = 21 - numberOne;
        int differenceTwo = 21 - numberTwo;
        if(numberOne > 21 || numberTwo > 21){
            return 0;
        } else {
            if(differenceOne > differenceTwo){
                return numberTwo;
            } else if(differenceOne < differenceTwo){
                return numberOne;
            } else {
                return numberOne;
            }
        }
    }

    public int uniqueSum(int numberOne, int numberTwo, int numberThree){

        if(numberOne == numberTwo && numberOne == numberThree) {
            return 0;
        } else if(numberOne == numberTwo){
            return numberThree;
        } else if (numberOne == numberThree){
            return numberTwo;
        } else {
            return numberOne + numberTwo + numberThree;
        }
    }

    public boolean tooHot(int temperature, boolean isSummer){
        if(isSummer){
            if(temperature > 60 && temperature < 100){
                return true;
            }
        } else {
            if(temperature > 60 && temperature < 90){
                return true;
            }
        }
        return false;
    }
}
