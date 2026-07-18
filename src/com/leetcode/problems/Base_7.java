package com.leetcode.problems;

/*
Given an integer num, return a string of its base 7 representation.

Example 1:
Input: num = 100
Output: "202"

Example 2:
Input: num = -7
Output: "-10"

Constraints:
-107 <= num <= 107
 */
public class Base_7 {
    static void main(String[] args) {
        System.out.println(convertBaseTo7(-7));
    }

    //my solution (1ms)
    public static String convertBaseTo7(int num) {
        if (num == 0) return "0";
        boolean isNegative = num<0;
        num = Math.abs(num);
        int rem = 0;
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            rem = num%7;
            result.append(rem);
            num = num/7;
        }

        if (isNegative) {
            result.append("-");
        }

        return result.reverse().toString();

    }

    //best solution (0ms)
    public static String convertBaseTo7Methode1(int num) {
        return Integer.toString(num, 7);
    }

}

