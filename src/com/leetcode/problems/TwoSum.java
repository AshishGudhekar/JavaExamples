package com.leetcode.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {

    static void main(String[] args) {
        int[] op= new int[2];
        op = twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(op));

    }

    //my solution:
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0;i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }

    // optimized solution
    public static int[] twoSumMethod1(int[] nums, int target) {
        //int ans[]= new int[2];

        for (int i=1;i<nums.length;i++){

            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]+nums[j-i] == target){
                    return new int[] {j-i,j};
                }
            }

        }
        return null;
    }
}
