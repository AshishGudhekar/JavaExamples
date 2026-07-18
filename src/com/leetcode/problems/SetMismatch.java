package com.leetcode.problems;

import java.util.Arrays;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
one of the numbers in s got duplicated to another number in the set, which results in repetition of one number
and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
 */
public class SetMismatch {
//    static{
//        for(int i=0;i<500;i++){
//            findErrorNums1(new int[]{1,2});
//        }
//    }
    public static int[] findErrorNums1(int[] nums) {
        if(nums==null || nums.length==0) return new int[]{};
        int[] ans=new int[2];
        int[] count=new int[nums.length+1];

        for(int num:nums){
            count[num]++;
        }
        for(int i=1;i<nums.length+1;i++){
            if(count[i]==2) ans[0]=i;
            if(count[i]==0) ans[1]=i;
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        findErrorNums1(new int[] {1,5,3,2,2,7,6,4,8,9});
        long endTime= System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime-startTime);
    }

    //my solution (743ms)
    public static int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];
        int seq =1;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count == 2) {
                    ans[0] = nums[j];
                    break;
                }
            }
        }

        while (seq<=nums.length) {
            boolean found = false;
            for (int num: nums) {
                if (num==seq) {
                    found=true;
                }
            }
            if (!found) {
                ans[1] = seq;
            }
            seq++;
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }


}
