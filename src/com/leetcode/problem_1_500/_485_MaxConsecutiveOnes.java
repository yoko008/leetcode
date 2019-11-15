package com.leetcode.problem_1_500;
/*485. Max Consecutive Ones*/ 
public class _485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int x = 0;
        int returnnum = 0;
        for (int num : nums) {
            if (num == 1) {
                x++;
                returnnum = Math.max(x, returnnum);
            } else {
                x = 0;
            }
        }
        return returnnum;
    }
}