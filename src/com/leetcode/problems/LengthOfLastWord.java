package com.leetcode.problems;

import java.util.List;

public class LengthOfLastWord {

    static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }


    //my solution:
    public static int lengthOfLastWord(String s) {

        String trimString = s.trim();
        String[] strlist = trimString.split(" ");
        System.out.println(strlist[strlist.length - 1].length());
        return strlist[strlist.length - 1].length();
    }

    //optimum solution:
    public static int lengthOfLastWord1(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }else if(len>0){
                break;
            }
        }
        return len;
    }
}
