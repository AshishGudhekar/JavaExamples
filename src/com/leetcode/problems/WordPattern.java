package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern
and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Explanation:
The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:
1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */
public class WordPattern {

    static void main(String[] args) {

    }

    public static boolean wordPattern(String pattern, String s) {
        String[] spl = pattern.split(" ");
        Map<String, String> map = new HashMap<>();

        if (s.length() != spl.length) {
            return false;
        }
        for (int i = 0; i < spl.length; i++) {
            map.put(spl[i], s.charAt(i)+"");
        }

        for (int i = 0; i < spl.length; i++) {
            if (map.get(spl[i]))
        }
    }
}
