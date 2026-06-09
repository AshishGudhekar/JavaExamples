package com.java.stream.Stream;
import java.util.*;

/**
 * Intermediate operations in a stream (like filter and map) are lazy and
 * process elements one by one only when a terminal operation (like findFirst)
 * is invoked, allowing early termination and efficient execution.
 */
public class LazyEvaluationExample {
    static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Sita", "Rahul", "Sam");

        // Demonstrating lazy evaluation and element-by-element pipeline flow
        Optional<String> firstSName = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("S");
                })
                .map(name ->{
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                })
                .findFirst();   // Terminal operation triggers processing

        System.out.println("First name starting with 'S': " + firstSName.orElse("None"));

        //output
//        Filtering: Aman
//        Filtering: Sita
//        Mapping: Sita
//        First name starting with 'S': SITA
    }
}
