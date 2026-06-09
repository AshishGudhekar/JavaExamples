package com.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardDemo {
    static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        List<String> ls = Arrays.asList("One", "Two", "Three");
        printList(li);
        printList(ls);
    }

    // below method uses parameter List<?> list which can accept multiple types of objects.
    static void printList(List<?> list) {
        for (Object obj: list) {
            System.out.println(obj);
        }
        System.out.println(list.size());
    }
}
