package com.leetcode.problem_501_1000;
/*852. Friends Of Appropriate Ages*/ 
public class _852_FriendsOfAppropriateAges {
    public int peakIndexInMountainArray(int[] A) {
        int a = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                a = i;
            }
        }
        return a;
    }
}