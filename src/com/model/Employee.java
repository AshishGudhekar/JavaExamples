package com.model;

public class Employee {

    //define variables
    long id;

    String firstName;

    String lastName;

    Byte age;

    char gender;

//    we need Constructor to build an object
//    JVM will provide default constructor in case constructor not defined

    // default constructor:
    public Employee() {}


    // Getters:
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // Setters:

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
