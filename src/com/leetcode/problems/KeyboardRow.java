package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of strings words, return the words that can be typed using letters of the alphabet
on only one row of American keyboard like the image below.
Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are
treated as if they are at the same row.

In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Explanation:
Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). 
 */
public class KeyboardRow {
    static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[] {"Hello","Alaska","Dad","Peace"})));
    }

    public static String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (String w : words) {
            String lower = w.toLowerCase();
            if (allInOneRow(lower, row1) || allInOneRow(lower, row2) || allInOneRow(lower, row3)) {
                list.add(w);
            }
        }

        return list.toArray(new String[0]);
    }

    private static boolean allInOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
