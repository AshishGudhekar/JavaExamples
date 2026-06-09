package com.java.stream.Stream;

public class Employee {
    private long Id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee() {}

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
    public void incrementSalary(double percentage) {
        this.salary += (this.salary * percentage) / 100;
    }

    @Override
    public String toString(){
        return " Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                "salary= " + salary +
                "}";
    }
}
