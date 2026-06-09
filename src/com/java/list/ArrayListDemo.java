package com.java.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListDemo {

    static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<String> countryNames = new ArrayList<String>();
        List<Character> characters = new ArrayList<Character>();
        var doubleNums = new ArrayList<Double>();
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("USA");
        countryNames.add("Chaina");
        countryNames.add("Rasia");
        countryNames.set(1, "England");
        countryNames.remove("Pakistan");
        String PowerfullCountryName = countryNames.get(3);
        countryNames.add(5, "Germany");
        boolean checkCountryNameInList = countryNames.contains("Pakistan");
        System.out.println(countryNames);
        System.out.println(PowerfullCountryName);
        System.out.println(checkCountryNameInList);
        checkCountryNameInList = countryNames.contains("USA");
        System.out.println(checkCountryNameInList);
    }
}
