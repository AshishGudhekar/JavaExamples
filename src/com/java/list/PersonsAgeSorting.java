package com.java.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class PersonsAgeSorting {

    public static void main (String[] args) {
        List<Person> sortedList = new ArrayList<Person>();

        sortedList = sortPersonsUsingAge();
        System.out.println(sortedList);
    }

    public static List<Person> sortPersonsUsingAge() {
        var persons = new ArrayList<Person>();
        persons.add(new Person("James", 65));
        persons.add(new Person("Sneha", 34));
        persons.add(new Person("Jenna", 30));
        persons.add(new Person("Harry", 29));
        persons.sort(Comparator.naturalOrder());    //OR
        //Collections.sort(persons);
        return persons;
    }

}
