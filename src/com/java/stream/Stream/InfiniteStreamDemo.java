package com.java.stream.Stream;

import java.util.Random;
import java.util.stream.IntStream;

public class InfiniteStreamDemo {

    static void main(String[] args) {

        // Using Random.ints():
        Random random = new Random();
        random
        // Get the next integer using ints() method
        .ints().limit(10).forEach(System.out::println);

        //Using IntStream.iterate()
        IntStream.iterate(0, num -> num+2) // 0(seed) for start of iteration & increment value by 2
                .limit(30)
                .forEach(System.out::println);
    }

}
