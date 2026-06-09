package com.java.list;

import java.util.*;

/**
 * Advantage:
 * LinkedList is better where write operation is needed
 * like adding removing element in middle of Arraylist gives performance issue.
 * that's why we use LinkedList because in LinkedList memory location of next and previous
 * element are connected to node(contain main element with next & prev location of other two element).
 * Disadvantage:
 * In Read operation (accessing element) is expensive in LinkedList
 * because element stored in different memory location.
 */
public class LinkedListDemo {

    static void main(String[] args) {

        // declare linkedList
        LinkedList<String> countries = new LinkedList<>();
        var foodList = new LinkedList<String>();

        // add elements to linkedList
        foodList.add("Pizza");
        foodList.add("Burger");
        foodList.add("Pasta");
        foodList.add("Ice-cream");

        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Rasia");
        countries.add("China");

        countries.size();

        // print list
        System.out.println(foodList);

        // iterate through list
        Iterator<String> iterator = foodList.iterator();
        while (iterator.hasNext()) {
            String food = iterator.next();
            System.out.println(food);
        }

        // for reverse iteration we use listIterator
        ListIterator<String> listIterator = foodList.listIterator(foodList.size());
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

        // sorting linkedList
        Collections.sort(countries, Comparator.naturalOrder());
        System.out.println(countries);


    }

}
