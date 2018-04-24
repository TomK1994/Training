package com.stariq;

// Leaf node class: all operations related to accessing children will be empty
// as it has no hidden children
public class Developer implements Employee{

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        // Method not applicable.
    }

    @Override
    public void remove(Employee employee) {
        // Method not applicable
    }

    @Override
    public Employee getChild(int i) {
        // Method not applicable
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("***" + "\n" +
                "Name: " + getName() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "***");
    }
}
