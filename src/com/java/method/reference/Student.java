package com.java.method.reference;
import java.util.function.Supplier;

/**
 * upplier<Student> is a functional interface with get() method.
 * Student::new refers to the constructor of Student.
 * When supplier.get() is called, a new Student object is created.
 * Equivalent lambda expression:
 * Supplier<Student> supplier = () -> new Student();
 */

class Student {
    Student() {
        System.out.println("Student object created");
    }
}

class Test{
    public static void main(String[] args) {

        Supplier<Student> supplier = Student::new;
        supplier.get();
    }
}
