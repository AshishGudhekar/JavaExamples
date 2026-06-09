package com.java.collectionsandwrapperClasses;

// process of converting primitive data type to wrapper objet is called Boxing.

public class BoxingDemo {

     static void main(String[] args) {

        int num = 18;

        // Approach 1: With the help of constructor.
        // not recommended approach since depreceted from version 9.
        Integer integer = new Integer(num);
        Double doubleObj = new Double(3.23);
        Long longObj = new Long("3234");

        String obj = "hello";

        // Approach 2: With the help of valueOf()
        Integer integer1 = Integer.valueOf(num);
        Double doubleObj1 = Double.valueOf(3.23);
        Long longObj1 = Long.valueOf("3234");

        // parsing is used to convert string datatype to their actual primitive data type.
        int num1 = Integer.parseInt("2300");
        System.out.println(num1); // string to int

    }
}
