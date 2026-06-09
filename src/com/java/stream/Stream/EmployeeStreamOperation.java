package com.java.stream.Stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamOperation {
    static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Mickey Mouse", 500000.0),
                new Employee(2, "Donald Duck", 200000.0),
                new Employee(3, "Goofy Goo", 100000.0)
        };
        Employee brotherBear = new Employee(4, "Brother Bear", 5000.0);
        Employee mufasa = new Employee(5, "Mufasa - The Lion King", 500000.0);

        List<Employee> empList = Arrays.asList(employees);

        // Stream of Existing array
        Stream<Employee> employeeStream = Stream.of(employees);

        //Stream from a list of individual Employee objects
        Stream<Employee> individualEmployeeStream = Stream.of(brotherBear, mufasa);

        // Using Stream.Builder to build a stream of Employee objects
        Stream.Builder<Employee> builder = Stream.builder();
        builder.accept(brotherBear);
        builder.accept(mufasa);
        builder.accept(new Employee(6, "SherKhan", 450000.0));
        Stream<Employee> employeeStream1 = builder.build();

        // increment salary of employee by 10%
        empList.forEach(e -> e.incrementSalary(10.0));

        // list of employee salary
        List<Double> salaries = empList.stream().map(Employee::getSalary).toList();

        // get employee having salary more than 200000
        List<Employee> employeesWithSalariesUnder200K = empList.stream()
                .filter(e -> e.getSalary() < 200000)
                .collect(Collectors.toList());

        Optional<Employee> employee = empList.stream().findFirst();

        //collect() is used to collect the stream into a Collection.
        // If we need to get an array out of the stream, we can simply use toArray().
        Employee[] employeesList = empList.toArray(Employee[]::new);

        //Comparison Based Stream Operations
        System.out.println(empList);
        List<Employee> sortedEmployeeBasedOnSalary = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sortedEmployeeBasedOnSalary);

        // max
        Employee highestSalariedEmployee = empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        // min
        Employee lowestSalariedEmployee = empList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        // distinct
        List<Long> duplicateFreeList = Stream.of(1, 2, 3, 3, 4, 4, 5, 5)
                .map(Integer::longValue)
                .distinct().collect(Collectors.toList());
        System.out.println(duplicateFreeList);

        Employee employee1 = new Employee();
        Supplier<String> example = employee1::toString;
        System.out.println(example.get());

    }
}

