/*
package com.leetcode.problems;

import java.util.Arrays;
import java.util.List;

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Example 1:
Input: nums = [10,2]
Output: "210"

Example 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 109


public class LargestNumber {
    static void main(String[] args) {

    }

    public static String largestNumber(int[] nums) {

        StringBuilder sb = new StringBuilder();
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        while(count > 0) {
            sb.append(9);
            count--;
        }
            int max = 0;
            int rem = 0;


        for (int i = len; i >=0; i--) {
            for (int j = 0; j < len; j++) {
                if ( (nums[j] == 9) || (nums[i] == 9 ) ) {
                    continue;
                }
                if ( (nums[j] != 9) || (nums[i] !=9 ) ){
                    if ( nums[j] > nums[i] ){
                        max = nums[j]/10;
                    }
                }
            }
            if(nums[i] < 9){

            }
        }

    }
}
*/
