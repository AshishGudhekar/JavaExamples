package com.java.collectionsandwrapperClasses;

public class AutoBoxingAndUnboxing {

    static void main(String[] args) {

        // Autoboxing
        Integer integer = 16;
        Character character = 'M';
        Boolean boolObj = false;

        // Autounboxing
        int num = integer;
        char char1 = character;
        boolean bool = boolObj;

        System.out.println(num);
        System.out.println(char1);
        System.out.println(bool);

        // carefull while handle null object
        Integer integer2 = null;
        try{
            int num1 = integer2;    // here NullPointerException will produce if not handled
        }
        catch (NullPointerException e){
            System.out.println("cannot convert null object to primitive int data type");
        }

        System.out.println("\"hello\"");


    }
}
