package com.stariq;

public class Main {

    public static void main(String[] args) {

        compositeDesignPattern();

    }

    public static void compositeDesignPattern(){

        Employee developer1 = new Developer("Emma", 1000);
        Employee developer2 = new Developer("Ann", 2020.10);
        Employee manager1 = new Manager("Tom", 40539.23);
        manager1.add(developer1);
        manager1.add(developer2);
        Employee developer3 = new Developer("John",34522);
        Manager manager2 = new Manager("Mark", 4093);
        manager2.add(developer3);
        manager2.add(manager1);
        manager2.print();
    }
}
