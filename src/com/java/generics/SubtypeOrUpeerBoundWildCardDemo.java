package com.java.generics;

import com.java.generics.model.Developer;
import com.java.generics.model.Employee;
import com.java.generics.model.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Subtype Or Upper Bound Wildcard:
 *      <? extends T> means the type that is either T or child of T,
 *      where T is a type used as the generics of a collection.
 */
public class SubtypeOrUpeerBoundWildCardDemo {
    static void main(String[] args) {
        List<Employee> employees = List.of(new Employee(), new Employee());
        printEmployeeAndTheirSubclassNames(employees);
        List<Developer> developers = List.of(new Developer(), new Developer());
        printEmployeeAndTheirSubclassNames(developers);
        List<Manager> managers = List.of(new Manager(), new Manager());
        printEmployeeAndTheirSubclassNames(managers);
    }

    public static void printEmployeeAndTheirSubclassNames(List<? extends Employee> employees)
    {
        /**
         * when we are using Subtype Or Upper Bound Wildcard, we can't add a new element/object
         * inside the collection. For example, inside below method if we try to add an object of Employee
         * or it's subtypes, we are going to get a compilation error.
         */
// employees.add(new Employee()); // we cannot add elements in collection when using subtype or Upper Bound Wildcard
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
