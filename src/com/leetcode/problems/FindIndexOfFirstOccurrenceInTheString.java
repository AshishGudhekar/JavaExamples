package com.leetcode.problems;

public class FindIndexOfFirstOccurrenceInTheString {


    static void main(String[] args) {
        strStr("abc", "c");
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            int i = haystack.indexOf(needle);
            return i;
        }else{
            return -1;
        }
    }

}
