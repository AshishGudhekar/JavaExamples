package com.java.map;

import javax.naming.directory.InitialDirContext;
import java.util.HashMap;

public class HashMapDemo {
    /**
     * How HashMap store data internally (in memory) IS MOST IMPORTANT question in interviews.
     */

    static void main(String[] args) {
        HashMap<String, String> countryMap = new HashMap<>();   //OR
        // var countryMap = new HashMap<String, String>();

        // when we use same key with different value then latest value will be considered
        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington, DC");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);
        // HashMap don't store element in sequence uses random manner
        System.out.println(countryMap);

        // fetch value using key
        System.out.println(countryMap.get("India"));
        countryMap.remove(null);
        System.out.println(countryMap.size());
        countryMap.clear(); // remove all element inside hashMap
        System.out.println(countryMap.isEmpty());


    }
}
