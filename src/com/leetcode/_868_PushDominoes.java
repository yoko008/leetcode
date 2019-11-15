package com.leetcode;
/*868. Push Dominoes*/ 
public class _868_PushDominoes {
    public int[][] transpose(int[][] A) {
        int[][] arr = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                arr[i][j] = A[j][i];
            }
        }
        return arr;
    }
}