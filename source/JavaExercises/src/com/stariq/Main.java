package com.stariq;

public class Main {

    public static void main(String[] args) {

        // Assignment
        String world = "Hello World!";
        System.out.println(world);

        // Parameters
        stringInput("Hello World!");

        // Return types
        System.out.println(helloWorld());

        // Operators & Conditionals
        System.out.println("Sum method: ");
        System.out.print(sum(4,2,false) + " ");
        System.out.print(sum(3,0,true) + " ");
        System.out.print(sum(0,5,true));

        // Iteration
        System.out.println("\nIterating through array: ");
        for(int i = 0; i < 10; i++){
            System.out.print(sum(i,0,true) + " ");
        }

        // Arrays
        int[] array = new int[10];
        System.out.println("\nSum using array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = (i+1)*2;
            System.out.print(sum(5,array[i],true) + " ");
        }

        // Iteration/Arrays
        System.out.println("\nContents of array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        // Iteration/Arrays 2
        int[] newArray = new int[10];
        System.out.println("\nOriginal values of array: ");
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = i + 1;
            System.out.print(newArray[i] + " ");
        }
        System.out.println("\nNew values of array: ");
        for(int i = 0; i < newArray.length; i++){
            newArray[i] *= 10;
            System.out.print(newArray[i] + " ");
        }
    }



    public static void stringInput(String input){
        System.out.println(input);
    }

    public static String helloWorld(){
        return "Hello World!";
    }

    public static int sum(int numberOne, int numberTwo, boolean getSum){
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
