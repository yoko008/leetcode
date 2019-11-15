package com.leetcode;
/*693. Binary Number with Alternating Bits*/ 
public class _693_BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int yu = -1;
        while (n > 0) {
            if (yu == n % 2) {
                return false;
            }
            yu = n % 2;
            n = n / 2;
        }
        return true;
    }
}