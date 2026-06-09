package com.java.method.reference;
import java.util.*;

/**
 * String::toUpperCase calls toUpperCase() on each String object.
 * map() transforms each element into uppercase.
 * System.out::println prints the transformed values.
 * Equivalent lambda expression:
 */
public class ClassMethodReferenceDemo {

    public static void main(String[] args){

        List<String> names = Arrays.asList("java", "spring", "microservice");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
