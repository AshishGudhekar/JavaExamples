package com.leetcode.problems;


/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class ReverseInt {

    static void main(String[] args) {
        int op = reverse(-123);
        System.out.println(op);
    }

    // my solution:
    public static int reverse(int x) {

        String numString = String.valueOf(Math.abs(x));
        boolean isNegative = x < 0;

        String result = "";
        for (int i =numString.length() - 1; i>=0; i--) {
            result += numString.charAt(i);
        }

        if(isNegative) {
            result = "-" + result;
        }

        /*if (Long.valueOf(result) < Integer.MIN_VALUE ||
            Long.valueOf(result) > Integer.MAX_VALUE ) {
             return 0;
        }*/

        try{
            Integer.valueOf(result);
        }catch (NumberFormatException e)
        {
            return 0;
        }

        int intResult = Integer.valueOf(result);
        return intResult;
    }

    // optimized solution:
    public static int reverse1(int y) {
        int reverse = 0;
        while( y != 0){
            int lastdigit = y % 10;
            if( reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10 ){
                return 0;
            }
            reverse = reverse * 10 + lastdigit;
            y = y / 10;
        }
        return reverse;
    }
}
