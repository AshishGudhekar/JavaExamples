package com.java.generics;

public class NonGenericCodeDemo {
    static void main(String[] args) {

        Pair strIntPair = new Pair("hello", 42);    // Objects pair

        // Drawbacks of NonGenerics

        strIntPair.setFirst(42);    // throw ClassCastException error because 42 is not string
        String myString = (String) strIntPair.getFirst(); // Require Casting because Hello is an object not String
        int myInt = (int) strIntPair.getSecond(); // Require Casting because 42 is an object not integer
        System.out.println(myString);
        System.out.println(myInt);
    }
}
