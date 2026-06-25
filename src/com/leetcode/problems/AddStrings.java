package com.leetcode.problems;

/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
You must also not convert the inputs to integers directly.

Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"

Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"

Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"

Constraints:
1 <= num1.length, num2.length <= 104
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
 */

public class AddStrings {
    static void main(String[] args) {

        System.out.println(addStringsMethode1("3876620623801494171", "6529364523802684779"));
        boolean isMthodeEqual = addStrings("3876620623801494171", "6529364523802684779")
                .equals(
                addStringsMethode1("3876620623801494171", "6529364523802684779") );
        System.out.println(isMthodeEqual);
    }

    // my solution
    public static String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = d1 + d2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }

    // optimized solution;
    public static String addStringsMethode1(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n=num1.length();
        int m=num2.length();
        int i=n-1;
        int j=m-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=(num1.charAt(i)-'0') + (num2.charAt(j)-'0')+carry;
            sb.append((char)((sum%10)+'0'));
            carry=sum/10;

            i--;
            j--;
        }
        while(i>=0){
            int sum=(num1.charAt(i)-'0') +carry;
            sb.append((char)((sum%10)+'0'));
            carry=sum/10;

            i--;
        }
        while(j>=0){
            int sum=(num2.charAt(j)-'0')+carry;
            sb.append((char)((sum%10)+'0'));
            carry=sum/10;
            j--;
        }
        if(carry==1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
