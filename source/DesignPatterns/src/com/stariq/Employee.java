package com.stariq;

// Component interface: represents object in composition
// and has all common operation applicable to manager and developer
public interface Employee {

    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public String getName();
    public double getSalary();
    public void print();

}


