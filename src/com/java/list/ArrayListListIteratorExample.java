package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample {

    static void main(String[] args) {

        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("USA");
        countryNames.add("China");
        countryNames.add("Rasia");
        System.out.println(countryNames);

        ListIterator<String> listIterator =  countryNames.listIterator(countryNames.size());
        while (listIterator.hasNext()) {
            String country = listIterator.next();
            System.out.println(country);

            if (country.equals("Pakistan")) {
                listIterator.remove();
            }
        }
        while (listIterator.hasPrevious()) {
            String country = listIterator.previous();
            System.out.println(country);
        }

        System.out.println(countryNames);
    }
}
