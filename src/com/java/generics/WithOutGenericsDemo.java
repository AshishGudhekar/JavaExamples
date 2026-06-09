package com.java.generics;

import java.util.ArrayList;

/**
 * let assume we have to create an array of String, int, boolean, float, double
 * means create array accepts all datatype
 * To achieve that we have example below that Don't have generics used in collection
 * which able to create an array of ant datatype.
 * explaination:
 * when we don't use generics to specify datatype of the array or list we actually
 * accept object e which can be of any type hence we can use ant datatype.
 */

public class WithOutGenericsDemo {
    static void main(String[] args) {

        // below there is no generics used so collection can accept any type of input to array.
        ArrayList list = new ArrayList();
        list.add(23);
        list.add("ashish");
        list.add(true);
        list.add(3.4);
        list.add(false);
        System.out.println(list);

        // Disadvantage of not using generics in collections
        // cannot do autocasting have to take care of manual casting
        String str = (String) list.get(1);  // here cast manually because we don't allow particular datatype
        int intval = (Integer) list.get(0);
    }
}
