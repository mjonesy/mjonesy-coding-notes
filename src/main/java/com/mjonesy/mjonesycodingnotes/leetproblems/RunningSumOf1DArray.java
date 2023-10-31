package com.mjonesy.mjonesycodingnotes.leetproblems;

// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            sumArray[i] = sum;
        }

        return sumArray;
    }
}
