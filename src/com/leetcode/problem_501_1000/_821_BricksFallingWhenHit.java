package com.leetcode.problem_501_1000;
/*821. Bricks Falling When Hit*/ 
public class _821_BricksFallingWhenHit {
    public int[] shortestToChar(String S, char C) {
        int[] intArr = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if ((i - j >= 0 && S.charAt(i - j) == C) || (i + j < S.length() && S.charAt(i + j) == C)) {
                    intArr[i] = j;
                    break;
                }
            }
        }
        return intArr;
    }
}