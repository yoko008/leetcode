package com.leetcode;

import java.util.HashSet;

/*766. Flatten a Multilevel Doubly Linked List*/
public class _766_FlattenaMultilevelDoublyLinkedList {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean tf = true;
        for (int i = 0; i < matrix.length - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix[0].length && i + j < matrix.length; j++) {
                set.add(matrix[i + j][j]);
            }
            if (set.size() != 1) {
                tf = false;
            }
        }
        for (int i = 0; i < matrix[0].length - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix.length && i + j < matrix[0].length; j++) {
                set.add(matrix[j][i + j]);
            }
            if (set.size() != 1) {
                tf = false;
            }
        }
        return tf;
    }
}