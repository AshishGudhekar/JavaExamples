package com.java.stream.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * There are a few Intermediate Operations mentioned below:
 *
 * 1. map(): The map method is used to return a stream consisting of the results of applying
 *      the given function to the elements of this stream.
 * Syntax:
 * <R> Stream<R> map(Function<? super T, ? extends R> mapper)
 *
 * 2. filter(): The filter method is used to select elements as per the Predicate passed as an argument.
 * Syntax:
 * Stream<T> filter(Predicate<? super T> predicate)
 *
 * 3. sorted(): The sorted method is used to sort the stream.
 * Syntax:
 * Stream<T> sorted()
 * Stream<T> sorted(Comparator<? super T> comparator)
 *
 * 4. flatMap(): The flatMap operation in Java Streams is used to flatten a stream of collections
 *      into a single stream of elements.
 * Syntax:
 * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
 *
 * 5. distinct(): Removes duplicate elements. It returns a stream consisting of the distinct elements
 *      (according to Object.equals(Object)).
 * Syntax:
 * Stream<T> distinct()
 *
 * 6. peek(): Performs an action on each element without modifying the stream. It returns a stream
 *      consisting of the elements of this stream, additionally performing the provided action on each element
 *      as elements are consumed from the resulting stream.
 * Syntax:
 * Stream<T> peek(Consumer<? super T> action)
 *
 * Explanation:
 * The listOfLists is created as a list containing other lists of strings.
 * flatMap(List::stream): Flattens the nested lists into a single stream of strings.
 * filter(s -> s.startsWith("S")): Filters the strings to only include those that start with "S".
 * map(String::toUpperCase): Converts each string in the stream to uppercase.
 * distinct(): Removes any duplicate strings.
 * sorted(): Sorts the resulting strings alphabetically.
 * peek(...): Adds each processed element to the intermediateResults set for intermediate inspection.
 * collect(Collectors.toList()): Collects the final processed strings into a list called result.
 */

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfLists.stream()
                .flatMap(List::stream)  //intermediate operation
                .filter(s -> s.startsWith("S")) //intermediate operation
                .map(String::toUpperCase)   //intermediate operation
                .distinct() //intermediate operation
                .sorted()
                .peek(intermediateResults::add) //intermediate operation
                .toList();  //terminator operation

        // Print the intermediate results
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }
}