package com.leetcode.problems;

import java.util.Arrays;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is,
for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

Example 1:
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

Example 2:
Input: nums = [6,5,4,8]
Output: [2,1,0,3]

Example 3:
Input: nums = [7,7,7,7]
Output: [0,0,0,0]

Constraints:
2 <= nums.length <= 500
0 <= nums[i] <= 100
 */
public class HowManyNumbersAreSmallerThantheCurrentNumber {
    static void main(String[] args) {
        smallerNumbersThanCurrent(new int[] {6,5,4,8});
    }

    //my solution (10ms)
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int num: nums) {
                if (nums[i]>num && num!=nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    //best solution (1ms/0ms)
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int freq[] = new int[101];
        int answer[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i = 1; i < 101; i++){
            freq[i] += freq[i - 1];
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                answer[i] = 0;
            }
            else{
                answer[i] = freq[nums[i] - 1];
            }
        }

        return answer;
    }

}
