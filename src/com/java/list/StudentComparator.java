package com.java.list;

import java.util.Comparator;

/**
 * In scenario(real projects) we get Domain Objects (StudentObject is Domain object)
 * from some organisation, or team that we cannot change so we cannot use Comparable interface there
 * so we create another class and use Comparator interface as shown below.
 * only here we have to use 2 separate object as parameter to compare unlike Comparable.
 * Also, we can make N number of Comparator for sorting logic.
 * example here we sorted marks in StudentNameComparator we will sort students based on their name.
 */
public class StudentComparator implements Comparator<StudentObject> {

    @Override
    public int compare(StudentObject o1, StudentObject o2){
        int marksComparision = Integer.compare(o1.marks, o2.marks);
        if (marksComparision == 0) {
            return Integer.compare(o1.rollNumber, o2.rollNumber);
        }
        return marksComparision;
    }
}
