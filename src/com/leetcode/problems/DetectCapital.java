package com.leetcode.problems;

/*
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false

Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
 */

import java.util.stream.Stream;

public class DetectCapital {
    static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }


    public static boolean detectCapitalUse(String word) {

        boolean isFirstUpper = false;
        boolean isFirstLower = false;
        int n = word.length();
        int count = 0;
        int count1 = 0;

        if ( Character.isUpperCase(word.charAt(0)) ) {
            isFirstUpper = true;
            count++;
            for (int i = 1; i < word.length(); i++) {
                if ( Character.isUpperCase(word.charAt(i)) ) {
                    count++;
                }else {
                    count1++;
                }
            }
        }else {
            isFirstLower = true;
            count1++;
            for (int i = 1; i < word.length(); i++) {
                if ( Character.isLowerCase(word.charAt(i)) ) {
                    count1++;
                }
            }
        }

        if(n==1) {
            return true;
        }if ( (isFirstUpper && (count==n)) || (isFirstUpper && (count1==n-1)) )  {
            return true;
        }if (isFirstLower && count1==n) {
            return true;
        }else {
            return false;
        }

    }
}
