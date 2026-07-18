package com.leetcode.problems;

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.
 */
public class ReverseString {
    static void main(String[] args) {
        System.out.println(reverseString(new char[] {'H', 'a', 'n','n','a','h'}));
    }

    public static char[] reverseString(char[] s) {

        char[] c = new char[s.length];
        int j = 0;

        for (int i = s.length - 1; i >= s.length/2; i--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j++;
        }
        return s;
}}
