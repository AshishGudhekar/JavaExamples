package com.leetcode.problems;

import java.util.Arrays;

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {
    static void main(String[] args) {
        String op = addBinaryMethod1("11111", "1");
        System.out.println(op);

    }


    // my solution: 2ms
    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() -1;
        int j = b.length() -1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i>=0) sum += a.charAt(i--) - '0';
            if (j>=0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;

        }

        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    // optimized solution: 0ms
    public static String addBinaryMethod1(String a, String b) {
        if(a.length() < b.length()) return addBinary(b, a);
        int n1 = a.length();
        int n2 = b.length();
        char[] c = new char[n1+1];

        int carry = 0;
        int digit = 0;
        for(int i = n1-1, j = n2-1; i >= 0; i--, j--) {
            digit = carry + a.charAt(i) - '0' + (j >= 0 ? (b.charAt(j) - '0' ) : 0);
            carry = digit / 2;
            c[i+1] = (char) (digit % 2 + '0');
        }

        if(carry == 1) {
            c[0] = '1';
            return new String(c);
        } else {
            return new String(c, 1, n1);
        }
    }
}
