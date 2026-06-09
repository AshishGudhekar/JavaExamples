package com.java.list;

public class StudentObject implements Comparable<StudentObject> {

    String name;
    int rollNumber;
    int marks;

    public StudentObject (String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ",rollNumber=" + rollNumber +
                ",marks=" + marks +
                "}";
    }


    @Override
    public int compareTo(StudentObject o) {
        int rollSequence = Integer.compare(this.rollNumber, o.rollNumber);
//        int markComparision = Integer.compare(this.marks, o.marks);
//        if (markComparision == 0) {
//            return Integer.compare(this.rollNumber, o.rollNumber);
//        }
        return rollSequence;
    }
}
