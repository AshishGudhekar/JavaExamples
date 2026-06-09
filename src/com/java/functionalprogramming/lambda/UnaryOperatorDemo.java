package com.java.functionalprogramming.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

/**
 * refer UnaryFunctional interface for details.
 */

public class UnaryOperatorDemo {

    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        BiFunction<List<Integer>, Integer, List<Integer>> result = UnaryOperatorDemo::incrementList;
        System.out.println(result.apply(numbers, 10));
    }

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {
        UnaryOperator<Integer> incrementBy = num -> num + incrementValue;

        // Apply the lambda expression to each integer in the list
        return numbers.stream()
                .map(incrementBy)
                .toList();
    }
}
