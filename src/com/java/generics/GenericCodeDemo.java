package com.java.generics;

public class GenericCodeDemo {
    static void main(String[] args) {
        GenericsPair<String, Integer> strIntPair = new GenericsPair<>("hello", 42);    // Objects pair

        // Benefits of Generics

        //strIntPair.setFirst(43);    // compilation error Instead of throw ClassCastException error gives in case wrong data inserted.
        String myString = strIntPair.getFirst(); // Don't Require Casting because used generics
        int myInt = strIntPair.getSecond(); // Don't Require Casting because 42 is an object not integer
        System.out.println(myString);
        System.out.println(myInt);

        // also we can modify existing data using setter method
        strIntPair.setFirst("Ashish");
        strIntPair.setSecond(2790840);
        String modifiedString = strIntPair.getFirst();
        int modifiedInt = strIntPair.getSecond();
        System.out.println(modifiedString);
        System.out.println(myInt);
    }
}
