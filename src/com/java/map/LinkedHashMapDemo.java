package com.java.map;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

/**
 * As both HashMap & TreeMap can't follow sequence of insertion to store element, so use [LinkedHashMap]
 * [LinkedHashMap] store element in sequence manner as it inserted.
 */
public class LinkedHashMapDemo {

    static void main(String[] args) {
        LinkedHashMap<Integer, String> theLinkedHashMap = new LinkedHashMap<>();
        theLinkedHashMap.put(3, "three");
        theLinkedHashMap.put(2, "Two");
        theLinkedHashMap.put(4, "Four");
        theLinkedHashMap.put(1, "One");
        theLinkedHashMap.put(0, "Zero");

        System.out.println(theLinkedHashMap);

        for (Map.Entry<Integer, String> num: theLinkedHashMap.entrySet()) {
            System.out.println(num.getKey() + ": " + num.getValue());
        }

        SequencedMap<Integer, String> reverseLinkedHashMap =theLinkedHashMap.reversed();
        System.out.println(reverseLinkedHashMap);
    }
}
