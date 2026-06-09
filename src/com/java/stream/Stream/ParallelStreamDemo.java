package com.java.stream.Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ParallelStreamDemo
 *
 * Demonstrates how to create and use a parallel stream in Java.
 *
 * How to create a parallel stream:
 * 1. Convert a sequential stream using .parallel()
 *    Example: Stream.of(1,2,3).parallel()
 * 2. Directly use parallelStream() from a Collection
 *    Example: list.parallelStream()
 *
 * Key points about parallel streams:
 * - They use ForkJoinPool.commonPool by default.
 * - Work is split into tasks and executed across multiple threads.
 * - Execution time is non-deterministic because thread scheduling
 *   depends on JVM and OS.
 * - Performance benefits appear when tasks are CPU-intensive and
 *   can be processed independently.
 *
 * Why execution time varies:
 * - Thread scheduling is handled by the OS, so distribution changes each run.
 * - Background processes, garbage collection, and system load affect timing.
 * - Overhead of splitting tasks and combining results adds variability.
 *
 * Best practices:
 * - Use a custom ForkJoinPool for predictable parallelism.
 * - Warm up the JVM before measuring performance.
 * - Use JMH (Java Microbenchmark Harness) for accurate benchmarking.
 */
public class ParallelStreamDemo {
    static void main(String[] args) {

        Stream<Integer> numStream = Stream.iterate(1, num -> num+1).limit(100).parallel();

        long startTime = System.currentTimeMillis();
        System.out.println
                (numStream
                .map(num -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return num * 2;
                })
                .collect(Collectors.toList()) );

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
