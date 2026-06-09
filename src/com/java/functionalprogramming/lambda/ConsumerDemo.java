package com.java.functionalprogramming.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * this accepts the input of any data type and do not return anything (return type is void)
 *
 */
public class ConsumerDemo {
    static void main(String[] args) {

        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("Good Morning");

        Consumer<Integer> squareOf = num -> System.out.println(num*num);
        List<Integer> numList=  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numList.forEach(squareOf);
    }

}
