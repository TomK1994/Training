package com.stariq.basic;

public class Basic {

    public Basic() {

        System.out.println("\n***BASIC***\n");

        System.out.println("-- Three different ways of outputting string --");
        // Assignment
        String world = "Hello World!";
        System.out.println(world);

        // Parameters
        stringInput("Hello World!");

        // Return types
        System.out.println(helloWorld());

        // Operators & Conditionals
        System.out.println("-- Sum method --");
        System.out.print(sum(4,2,false) + " ");
        System.out.print(sum(3,0,true) + " ");
        System.out.print(sum(0,5,true));

        // Iteration
        System.out.println("\n-- Iterating through array --");
        for(int i = 0; i < 10; i++){
            System.out.print(sum(i,0,true) + " ");
        }

        // Arrays
        int[] array = new int[10];
        System.out.println("\n-- Sum using array --");
        for(int i = 0; i < array.length; i++){
            array[i] = (i+1)*2;
            System.out.print(sum(5, array[i],true) + " ");
        }

        // Iteration/Arrays
        System.out.println("\n-- Contents of array --");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        // Iteration/Arrays 2
        int[] newArray = new int[10];
        System.out.println("\n-- Original values of array --");
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = i + 1;
            System.out.print(newArray[i] + " ");
        }
        System.out.println("\n-- New values of array --");
        for(int i = 0; i < newArray.length; i++){
            newArray[i] *= 10;
            System.out.print(newArray[i] + " ");
        }
        System.out.println(" ");
    }

    public void stringInput(String input){
        System.out.println(input);
    }

    public String helloWorld(){
        return "Hello World!";
    }

    public int sum(int numberOne, int numberTwo, boolean getSum){
        if(getSum){
            if(numberOne == 0 && numberTwo != 0){
                return numberTwo;
            } else if (numberTwo == 0 && numberOne != 0){
                return numberOne;
            } else {
                return numberOne + numberTwo;
            }
        } else {
            return numberOne * numberTwo;
        }
    }
}
