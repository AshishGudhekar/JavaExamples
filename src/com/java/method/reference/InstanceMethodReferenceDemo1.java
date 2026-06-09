package com.java.method.reference;

import java.util.Arrays;
import java.util.List;

/**
 * printer is an object of the Printer class.
 * printer::print refers to the instance method print().
 * Each element of the list is automatically passed to print().
 * Equivalent lambda expression: data.forEach(msg -> printer.print(msg));
 */
public class InstanceMethodReferenceDemo1 {

    static void main(String[] args) {

        Printer printer = new Printer();
        List<String> data = Arrays.asList("Java", "Spring", "Boot");

        data.forEach(printer::print);
    }

}

class Printer{
    void print(String msg) {
        System.out.println(msg);
    }
}
