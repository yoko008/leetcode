package com.leetcode.problem_1_500;
/*220. Contains Duplicate III*/ 
public class _220_ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((long) nums[i] - (long) nums[j] <= t && (long) nums[i] - (long) nums[j] >= -t && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}