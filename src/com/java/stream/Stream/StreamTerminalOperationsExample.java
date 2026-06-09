package com.java.stream.Stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {
    static void main(String[] args) {

        // Sample data
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        // for each print each name.
        System.out.println("forEach: ");
        names.stream().forEach(System.out::println);

        //collect: Collect name starting with 'S' into a list
        List<String> namesStartsWithS = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        namesStartsWithS.forEach(System.out::println);

        //reduce: Concatenate all names into a single String.
        String concatenatedString = names.stream().
                reduce("", (partialString, element) -> partialString + " " + element);
        System.out.println("\nreduce: (concatenated names): ");
        System.out.println(concatenatedString.trim());

        // count: number of names.
        long count=  names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);

        // findFirst: Find the first name
        System.out.println("\nFindFirst: " + ( names.stream().findFirst() ));

        // allMatch: Check if all names start with 'S'
        boolean allStartsWithS = names.stream().allMatch(s -> s.startsWith("S"));
        System.out.println("\nallMatch (all starts with 'S'): ");
        System.out.println(allStartsWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyMatchStartsWithS = names.stream().anyMatch(s -> s.startsWith("S"));
        System.out.println("\nanyMatch (all starts with 'S'): ");
        System.out.println(anyMatchStartsWithS);
    }
}
