package com.leetcode.problems;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    static void main(String[] args) {
        boolean op = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(op);
    }

    //my solution: 14ms
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String rev = sb.reverse().toString();
        return str.equals(rev);
    }

    //optimized solution : 1ms
        public static boolean isPalindromeMethode1(String s) {
            // s = s.toLowerCase();
            int i = 0;
            int j = s.length() - 1;

            while(i<j){
                char start = s.charAt(i);
                char end = s.charAt(j);

                while(i < j && (start < 97 || start > 122 )) {
                    if(65 <= start && start <= 90){
                        start += 32;
                        break;
                    }
                    else if(48 <= start && start <= 57)
                        break;
                    i++;
                    start = s.charAt(i);
                }

                while(i < j && (97 > end || end > 122 )) {
                    if(65 <= end && end <= 90){
                        end += 32;
                        break;
                    }
                    else if(48 <= end && end <= 57)
                        break;
                    j--;
                    end = s.charAt(j);
                }

                if(i < j && start != end){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}
