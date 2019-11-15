package com.leetcode;

import java.util.Arrays;

/*169. Majority Element*/
public class _169_MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    num++;
                } else {
                    if (num > nums.length / 2) {
                        return nums[i];
                    }
                    i = j - 1;
                    num = 1;
                    break;
                }
            }
        }
        return nums[nums.length - 1];
    }
}