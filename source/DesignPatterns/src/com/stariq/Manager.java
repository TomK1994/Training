package com.stariq;

// Composite class: all common method delegates its operations to child objects
// and has method to access and modify its children
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
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

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }
}
