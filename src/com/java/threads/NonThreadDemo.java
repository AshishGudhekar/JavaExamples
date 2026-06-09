package com.java.threads;

/**
 * in this class there is no thread and that is why we are executing code line by line.
 */
public class NonThreadDemo {
    static void main(String[] args) {

        for (int i=0; i<10; i++){
            System.out.println(i);
        }

        for (int i=10; i<21; i++){
            System.out.println(i);
        }
    }
}
