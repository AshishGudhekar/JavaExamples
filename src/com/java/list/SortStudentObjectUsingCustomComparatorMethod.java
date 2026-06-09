package com.java.list;

import java.util.*;

public class SortStudentObjectUsingCustomComparatorMethod {

    static void main(String[] args) {

        var students = new ArrayList<StudentObject>();
        students.add(new StudentObject("john", 51, 90));
        students.add(new StudentObject("Ashish", 34, 92));
        students.add(new StudentObject("Aniket", 32, 90));
        students.add(new StudentObject("Krish", 36, 95));
        students.add(new StudentObject("Aakash", 40, 98));
        System.out.println(students);
        Collections.sort(students);
        System.out.println("According to marks object arranged in ascending order: \n" + students);

        Iterator<StudentObject> studentObjIterator = students.iterator();
        while (studentObjIterator.hasNext()) {
            StudentObject studentObject = studentObjIterator.next();
            if (studentObject.name.equalsIgnoreCase("aniket") && studentObject.marks==90) {
                System.out.println("this cannot be my brother: "+ studentObject);
            }
        }

        Collections.sort(students, new StudentNameComparator());
        System.out.println(students);

    }
}
