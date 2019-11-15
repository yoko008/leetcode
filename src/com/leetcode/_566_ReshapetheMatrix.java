package com.leetcode;
/*566. Reshape the Matrix*/ 
public class _566_ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        } else {
            int[][] newnums = new int[r][c];
            int[] n = new int[nums.length * nums[0].length];
            int num = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    n[num] = nums[i][j];
                    num++;
                }
            }
            num = 0;
            for (int i = 0; i < newnums.length; i++) {
                for (int j = 0; j < newnums[i].length; j++) {
                    newnums[i][j] = n[num];
                    num++;
                }
            }
            return newnums;
        }

    }
}