package com.leetcode.problems;

/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"

Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"


Constraints:
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */

public class ReverseVovels {
    static void main(String[] args) {

    }

    public static String reverseVowels(String s) {

        String temp = "";
        String[] strArr = s.split("");
        int len = strArr.length;
        String[] vowels = {"A", "E", "I", "O", "U"};

        for (int i = 0; i >= len/2 -1; i--) {
            for (int j = len; j > len/2 -1; j--) {

            }
        }
        return null;
    }
}
