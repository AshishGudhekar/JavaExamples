package com.java.map;

import java.util.Map;
import static java.util.Map.entry;

import static java.util.Map.entry;

public class ImmutableMapDemo {
    static void main(String[] args) {
        // we use of() method to make Map Immutable, so cannot add or remove elements in it.
        Map<String, Integer> stringIntegerMap = Map.of("a",1, "b",2, "c", 3);
        stringIntegerMap.put("d", 4);   // gives runTimeException Error because tring to modify immutable Object Map
        processMap(stringIntegerMap);

        // importing (java.util.Map.entry) so use directly entry method. this also an immutable Object Map.
        // ofEntries() method is used to add elements when it's more than 10.
        Map<Integer, String> integerStringMap = Map.ofEntries(entry(1, "One"), entry(2, "Two"),
                entry(3, "Three"));
        processMap1(integerStringMap);
    }

    public static void processMap(Map<String, Integer> stringIntegerMap) {
        for (Map.Entry<String, Integer> entry: stringIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void processMap1(Map<Integer, String> stringIntegerMap) {
        for (Map.Entry<Integer, String> entry: stringIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
