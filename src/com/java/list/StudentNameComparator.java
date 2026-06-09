package com.java.list;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<StudentObject> {

    public int compare(StudentObject o1, StudentObject o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
    }
}
