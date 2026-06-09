package com.java.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * As HashMap can't store objects either in sequenced and sorted order, so TreeMap is used.
 * TreeMap stores elements in sorted format based on their keys.
 */
public class TreeMapDemo {
    static void main(String[] args) {
        Map<Integer, String> numbers = new TreeMap<>();
        numbers.put(12, "Twelve");
        numbers.put(4, "Four");
        numbers.put(3, "Three");
        numbers.put(13, "Thirteen");
        numbers.put(10, "Ten");
        numbers.put(1, "One");

        for (Map.Entry<Integer, String> num: numbers.entrySet()) {
            System.out.println(num.getKey() + "-" + num.getValue());
        }
    }
}
