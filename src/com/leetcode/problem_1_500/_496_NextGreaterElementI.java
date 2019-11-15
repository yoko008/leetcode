package com.leetcode.problem_1_500;
/*496. Next Greater Element I*/ 
public class _496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            boolean tf = false;
            int num = nums1[i];
            nums1[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (num == nums2[j]) {
                    tf = true;
                }
                if (tf && num < nums2[j]) {
                    nums1[i] = nums2[j];
                    break;
                }
            }
        }
        return nums1;
    }
}