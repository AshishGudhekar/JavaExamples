package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample {

    static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("USA");
        countryNames.add("China");
        countryNames.add("Rasia");
        System.out.println(countryNames);

        Iterator<String> iterator =  countryNames.iterator();
        while(iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country);

            if (country.equals("Pakistan")) {
                iterator.remove();
            }
        }

        System.out.println(countryNames);
    }


}
