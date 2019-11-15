package com.leetcode;
/*832. Binary Tree Pruning*/ 
public class _832_BinaryTreePruning {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int a = A[i][j];
                A[i][j] = A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = a;
            }
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0)
                    A[i][j] = 1;
                else if (A[i][j] == 1)
                    A[i][j] = 0;
            }
        }
        return A;
    }
}