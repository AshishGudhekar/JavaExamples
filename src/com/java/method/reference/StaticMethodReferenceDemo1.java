package com.java.method.reference;

import java.util.Arrays;

/**
 * Explanation: In the above example, we are using method reference to print items.
 * The print method is a static method which is used to print the names.
 * In the main method we created an array of names and printing each one by calling the print method directly.
 *
 * <b>A static method reference is used to refer to a static method of a class. It replaces a lambda expression
 *  that simply calls a static method.</b>
 */
public class StaticMethodReferenceDemo1 {

    public static void main(String[] args){
        String[] names = {"Geek1", "Geek2", "Geek3"};

        // Using method reference to print each name
        Arrays.stream(names).forEach(StaticMethodReferenceDemo1::print);
    }

    public static void print(String s){
        System.out.println(s);
    }
}
