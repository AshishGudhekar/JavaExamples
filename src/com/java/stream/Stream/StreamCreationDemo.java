package com.java.stream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream was introduced in Java 8, the Stream API is used to process collections of objects.
 * It is a sequence of objects that supports various methods that can be pipelined to produce the desired result.
 *
 * There are two types of Operations in Streams:
 * Intermediate Operations
 * Terminal Operations
 */
public class StreamCreationDemo {
    static void main(String[] args) {
        List<String> departments= new ArrayList<>();
        departments.add("Supply");
        departments.add("HR");
        departments.add("Sales");
        departments.add("Marketing");

        Stream<String> depStream = departments.stream();
        depStream.forEach(System.out::println);

        Stream<String> inStream = Stream.of("Ashish", "Vilas", "Gudhekar");
        inStream.forEach(System.out::println);

        Stream<String> deparatmentStream = departments.parallelStream();
        deparatmentStream.forEach(System.out::println);

    }
}
