package com.java.threads;

/**
 * Your threaded sum program takes longer because threads add overhead.
 * Creating and managing threads, plus waiting with join(), costs extra time.
 * Summing integers is a pure CPU task, so splitting it doesn’t speed up much
 * unless you have many cores. The sequential loop runs tightly optimized,
 * while threads introduce context switching and synchronization, making it slower in this case.
 */
public class SumOfIntsThreadDemo {

    static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long result = 0;
        SumThread thread1 = new SumThread(0, Integer.MAX_VALUE/2);
        SumThread thread2 = new SumThread((Integer.MAX_VALUE/2)+1, Integer.MAX_VALUE);
        thread1.start();
        thread2.start();
        thread1.join(); // join() used to allow thread to complete there execution
        thread2.join();
        result = thread1.getResult() + thread2.getResult();
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken by multiple thread Java class is : "+ (endTime-startTime));
    }

}
