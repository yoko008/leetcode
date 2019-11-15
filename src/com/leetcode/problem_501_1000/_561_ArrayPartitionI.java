package com.leetcode.problem_501_1000;

import java.util.Arrays;

/*561. Array Partition I*/
public class _561_ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
       /* for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    int change = nums[i];
                    nums[i] = nums[j];
                    nums[j] = change;
                }
            }
        }*/
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}