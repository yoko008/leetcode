package com.leetcode.problem_1_500;

import java.util.Arrays;

/*283. Move Zeroes*/
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        nums = new int[]{0, 0, 1};
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    int a = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}