package com.leetcode;

import java.math.BigInteger;

/*371. Sum of Two Integers*/
public class _371_SumofTwoIntegers {
    public int getSum(int a, int b) {
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger c1 = a1.add(b1);
        return Integer.parseInt(c1.toString());
    }
}