package com.java.generics;

import java.util.Arrays;

public class GenericMethodDemo {

    static void main(String[] args) {

        String[] stringArray = {"Ashish", "Vilas", "Gudhekar"};
        Integer[] intArray = {1,2,3,4,5};
        printArray(stringArray);
        printArray(intArray);
    }

    public static <T> void printArray(T[] array){
        for (T element:array){
            System.out.println(element);
        }
    }
}
