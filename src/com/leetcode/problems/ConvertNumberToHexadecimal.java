package com.leetcode.problems;

/*
Given a 32-bit integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.

Example 1:

Input: num = 26
Output: "1a"
Example 2:

Input: num = -1
Output: "ffffffff"


Constraints:

-231 <= num <= 231 - 1
 */

public class ConvertNumberToHexadecimal {

    static void main(String[] args) {
        System.out.println(15 & 15);
        String op = toHex(15);
        System.out.println(op);
    }

    // my solution
    public static String toHex(int num) {
        return Integer.toHexString(num);
    }

    // other Approach: without builtin methode
    public String toHexMethode1(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

            if(num == 0) return "0";
            String result = "";
            while(num != 0){
                result = map[(num & 15)] + result;
                num = (num >>> 4);
            }
            return result;
    }
}
