package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Array stores Fixed size same primitive datatype elements in contiguous manner in memory.
 * array size cannot modify it is fixed to change it we have to create new array.
 * ArrayList changes its size dynamically and store elements of different datatypes(objects).
 * ArrayList does not store primitive datatypes it only store an Objects. in contiguous manner in memory.
 * to convert Array to ArrayList we use Arrays.asList(yourArray) method.
 * to convert ArrayList to Array we use Arrays.toString(new datatypeOfArray[0])
 * java internally handles the size of the array just have to set 0 or we can use arraylist.size()
 * method to provide size of it.
 */

public class ArrayVsArrayList {

    static void main(String[] args) {

        // converting ArrayList to Array.
        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("UAS");
        countryNames.add("Japan");
        countryNames.add("Germany");
        countryNames.add("India");

        // here we have to provide type of the array which we are converting
        //so, new String[0] is provided as we want array of String size does not matters
        // because java internally checks size of collection.size() and creates new array of required size.
        String[] countries = countryNames.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));


        // converting Array to arrayList.
        List<String> newList = Arrays.asList(countries);
        System.out.println(newList);
    }
}
