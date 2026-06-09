package com.java.functionalprogramming.lambda;

import java.util.function.Function;

/**
 * Function<T, R> T refer to a input datatype and the R refers to the return type of data.
 * and uses apply method which is abstract method of Function interface.
 */

public class FunctionInterfaceDemo {

    static void main(String[] args) {

        Function<String, String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("gudhekar"));

        Function<String, Integer> getStrLength = input -> input.length();
        System.out.println(getStrLength.apply("gudhekar"));

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("gudhekar"));

        Function<Integer, Integer> doubleValue = num -> num*2;
        Function<Integer, Integer> addThree = num -> num+3;

        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        // 1st leftside will execute 5*2 =10 and then rightside executes 10+3=13
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);
        // 1st rightside will execute 5+3=8 and then leftside executes 8*2=16
        System.out.println(output1.apply(5) );  //13
        System.out.println(output2.apply(5) );  //16
    }
}
