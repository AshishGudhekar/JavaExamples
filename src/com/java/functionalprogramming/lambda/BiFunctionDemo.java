package com.java.functionalprogramming.lambda;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionDemo {

    static void main(String[] args) {

        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1+num2)%2 == 0;
        System.out.println( isSumEven.test(12, 13) );   //false

        BiFunction<Double, Double, Double> calculatePower  = (num1, num2) -> Math.pow(num1,num2);
        System.out.println( calculatePower.apply(2.0, 4.0) );
    }
}
