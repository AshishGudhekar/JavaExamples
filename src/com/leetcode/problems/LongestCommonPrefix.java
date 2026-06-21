package com.leetcode.problems;

public class LongestCommonPrefix {

    static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        System.out.println(strs[1].indexOf("flower"));

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
