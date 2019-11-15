package com.leetcode.problem_1_500;
/*204. Count Primes*/ 
public class _204_CountPrimes {
    public int countPrimes(int n) {
        int num = 0;
        if (n < 2) {
            return 0;
        }
        boolean[] a = new boolean[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }
        a[0] = false;
        a[1] = false;
        for (int i = 2; i < n; i++) {
            if (a[i]) {
                for (int j = i * 2; j < n; j = j + i) {
                    a[j] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i]) {
                num++;
            }
        }
        return num;
    }
}