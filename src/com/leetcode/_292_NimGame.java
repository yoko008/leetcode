package com.leetcode;
/*292. Nim Game*/ 
public class _292_NimGame {
    public boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }
}