package com.leetcode;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    public int oddCells(int n, int m, int[][] indices) {
        int[][] arr = new int[m][n];
        int res = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int cloum = indices[i][1];
            for (int j = 0; j < arr.length; j++) {
                arr[j][row] += 1;
            }
            for (int j = 0; j < arr[cloum].length; j++) {
                arr[cloum][j] += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0;
        int sum2 = 0;
        List list = new LinkedList();
        for (int i = 0; i < colsum.length; i++) {
            sum += colsum[i];
            if (colsum[i] == 2) {
                sum2++;
            }
        }
        if (sum != upper + lower || sum2 > upper || sum2 > lower) {
            return list;
        }
        List u = new LinkedList();
        List l = new LinkedList();
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 2) {
                u.add(1);
                upper--;
                l.add(1);
                lower--;
            }
            if (colsum[i] == 1) {
                if (upper > lower) {
                    u.add(1);
                    upper--;
                    l.add(0);
                } else {
                    l.add(1);
                    lower--;
                    u.add(0);
                }
            }
            if (colsum[i] == 0) {
                u.add(0);
                l.add(0);
            }
        }
        list.add(u);
        list.add(l);
        return list;
    }

}