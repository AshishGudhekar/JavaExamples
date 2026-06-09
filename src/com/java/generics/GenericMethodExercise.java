package com.java.generics;

import java.util.Arrays;

public class GenericMethodExercise {

    public static void main (String[] args) {
        Integer[] array = {1,2,3,4};
        String[] array1 = {"Ashish", "Vilas", "Gudhekar", "Aniket"};
        String[] storage = swap(array1, 2, 3);
        System.out.println(Arrays.toString(storage));
    }

    public static <T> T[] swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}
