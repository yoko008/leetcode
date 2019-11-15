package com.leetcode;
/*27. Remove Element*/ 
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int num = nums.length;
        for (int i = 0; i < num; i++) {
            if (nums[i] == val) {
                for (int j = i; j < num - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                num--;
                i--;
            }
        }
        return num;
    }
}