package com.java.generics;

import com.java.generics.model.Developer;
import com.java.generics.model.Employee;
import com.java.generics.model.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Since Java 5, when overriding a method in a subclass,the return type of the overriding method can
 * be a subtype of the return type of the overridden method in the superclass.
 * Before Java 5: Overridden methods had to have the exact same return type.
 * With Covariant Return Types: This feature improves type safety and code readability by
 * allowing developers to work with more specific return objects without explicit casting
 * example:
 * class Animal {
 *     public Animal produce() {
 *         return new Animal();
 *     }
 * }
 *
 * class Dog extends Animal {
 *     @Override
 *     public Dog produce() { // Returns a subtype (Dog) of the superclass return type (Animal)
 *         return new Dog();
 *     }
 * }
 */
public class CovarianceDemo {
    static void main(String[] args) {

        Employee[] employees = {new Employee(), new Employee()};
        printArray(employees);
        Developer[] developers = {new Developer(), new Developer()};
        printArray(developers);
        Manager[] managers = {new Manager(), new Manager()};
        printArray(managers);

        String s = "Generics";
        Object o = s;   // we can assign s to o because String is subclass of Object

        String[] sArray = {"Generics", "collection"};
        Object[] array = sArray;

        // *******************************************************************************************
        // DON'T USE COVARIANCE WITH COLLECTIONS IT WON'T WORK.
        // *******************************************************************************************
        List<String> stringList = new ArrayList<>();    // covariance will not work with collection
        List<Object> objectList = new ArrayList<>();    // therefore the stringList cannot assign to
        // objectList = stringList;                     // the objectList
        // *******************************************************************************************

        Number[] numArray = {1,2,3};
        Object[] objects = numArray;    // covariance accepted
        objects[0] = "String";  // at runtime throw exception

    }

    public static void printArray(Employee[] employees) {
        for(Employee employee:employees){
            System.out.println(employee);
        }

    }
}
