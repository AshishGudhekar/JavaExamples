package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 */
public class FindAllNumbersDisappearedInArray {
    static void main(String[] args) {
        findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int seq =1;

        while (seq<=nums.length) {
            boolean found = false;
            for (int num: nums) {
                if (num==seq) {
                    found=true;
                }
            }
            if (!found) {
                ans.add(seq);
            }
            seq++;
        }

        System.out.println(ans);
        return ans;

    }
}
