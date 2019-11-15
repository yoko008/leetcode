package com.leetcode.problem_501_1000;

import java.util.HashSet;

/*575. Distribute Candies*/
public class _575_DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        int n = candies.length / 2;
        for (int i : candies) {
            set.add(i);
        }
        int d = set.size();
        return d > n ? n : d;
    }
}