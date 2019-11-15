package com.leetcode.problem_1_500;

import java.util.Arrays;

/*4. Median of Two Sorted Arrays*/
/*4. 寻找两个有序数组的中位数
题目描述
评论 (1.3k)
题解(244)New
提交记录

给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

你可以假设 nums1 和 nums2 不会同时为空。

示例 1:

nums1 = [1, 3]
nums2 = [2]

则中位数是 2.0

示例 2:

nums1 = [1, 2]
nums2 = [3, 4]

则中位数是 (2 + 3)/2 = 2.5

*/
public class _4_MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                arr[i] = nums1[i];
            } else {
                arr[i] = nums2[i - nums1.length];
            }
        }
        Arrays.sort(arr);
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / (2d);
        }
    }
}