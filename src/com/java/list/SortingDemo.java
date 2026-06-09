package com.java.list;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class SortingDemo {

    static void main(String[] args) {
        // sorting numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-4);
        numbers.add(-3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(0);
        System.out.println("original number list: " + numbers);
        Collections.sort(numbers);
        System.out.println("sorted numbers: " + numbers);
        Collections.sort(numbers, Comparator.reverseOrder() );
        System.out.println("number in descending order: " + numbers);
        System.out.println();

        // sorting String
        var countries = new ArrayList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Canada");
        countries.add("France");
        countries.add("Japan");
        System.out.println("original sequence: " + countries);
        Collections.sort(countries);    // or we can use
        //countries.sort(Comparator.naturalOrder());  // arrange array in ascending order
        System.out.println("Sorted sequence of countries: " + countries);
        Collections.sort(countries, Comparator.reverseOrder() );
        //countries.sort(Comparator.reverseOrder());  // arrange array in descending order
        System.out.println("descending order of countries: " + countries);
        System.out.println();

        var countries1 = new ArrayList<String>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Canada");
        countries1.add("France");
        countries1.add("Japan");

        countries1.sort(new LastCharComparator());
        System.out.println(countries1);

    }
}
