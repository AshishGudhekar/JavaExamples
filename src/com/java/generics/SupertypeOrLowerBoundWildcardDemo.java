package com.java.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * <h3>CONTRAVARIANCE</h3> is the opposite of covariance, and it refers to the ability of a type to accept more
 * generic (broader) types. The Upper Bound section shows that an upper bounded wildcard restrict the
 * unknown type to be specific type or subtype of that type and is represented using the extends keyword.
 * In a similar way the lower bound wildcard restrict the unknown type to be a specific type or a subtype
 * of that type.
 *
 */
public class SupertypeOrLowerBoundWildcardDemo {
    static void main(String[] args) {
        addNumbers(new ArrayList<>());
        System.out.println();
    }

    // as below mention is Integer so Integers and their parent class can only allow here to validate.
    public static void addNumbers(List<? super Integer> list) {
        for (int i=0; i<10; i++){
            list.add(i);
        }
        // list.add(3.14); // here double is not SupperClass of Integer that is why restricted.
        System.out.println(list);
    }

}
