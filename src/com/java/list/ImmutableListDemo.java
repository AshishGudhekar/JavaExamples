package com.java.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

    public static void main(String[] args) {

        List<Integer> accountNumbers = new ArrayList<>();
        accountNumbers.add(242344);
        accountNumbers.add(324234);
        accountNumbers.add(343453);
        // make List Immutable so methods cannot modify the list
        accountNumbers = Collections.unmodifiableList(accountNumbers);
        List<Integer> immutableAccountList = List.of(242344, 324234, 343453);
        List<Integer> dollerCreditAccNo = addTenDollers(accountNumbers);
        
    }

    private static List<Integer> addTenDollers(List<Integer> accountNumbers) {

        accountNumbers.add(545354);
        for(Integer i: accountNumbers) {
            System.out.println("10 Dollers Credited to Account Number: " + i);
        }
        return accountNumbers;
    }
}
