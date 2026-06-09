package com.java.collectionsandwrapperClasses;

public class UnboxingDemo {

    static void main(String[] args) {

        int num = 18;
        // Boxing : primitive datatype to wrapper class object
        Integer integer = new Integer(num);
        Double doubleObj = new Double(3.23);
        Long longObj = new Long("3234");

        // Unboxing : convert Wrapper class Object to primitive datatype
        int integer1 = integer.intValue();
        double double1 = doubleObj.doubleValue();
        long long1 = longObj.longValue();

        System.out.println(integer1);
        System.out.println(double1);
        System.out.println(long1);

    }
}
