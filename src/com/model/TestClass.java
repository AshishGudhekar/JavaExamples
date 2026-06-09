package com.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    static double pi;

    // static Initialization block
    static {
        pi = 3.14;  // we can initialize static variables in this block
        System.out.println("static initialization block is executed!");
    }

    static void main(String[] args) {

        System.out.println("main method is executing ...");
        System.out.println(pi);
    }
}
