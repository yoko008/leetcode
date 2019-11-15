package com.leetcode;
/*136. Single Number*/ 
public class _136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result = n ^ result;
        }
        return result;
    }
}