package com.leetcode.problems;

import java.util.Arrays;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]

Constraints:
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3

 */
public class ShuffleTheArray {
    static void main(String[] args) {
        shuffle(new int[] {1,2,5,8}, 2);
    }

    //my solution (4ms)
    public static int[] shuffle(int[] nums, int n) {

        int m = nums.length;
        int[] ans = new int[m];
        int x = 0;
        int y = 1;

        int i=0;
        int j=m/2;
        while (i<m/2 && j<m) {
            ans[x] = nums[i];
            ans[y] = nums[j];
            x+=2;
            y+=2;
            i++;
            j++;
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }

    //best solution (0ms)
    public int[] shuffle1(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;
        for(int i=0; i<n; i++){
            ans[index++] = nums[i];
            ans[index++] = nums[i+n];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
