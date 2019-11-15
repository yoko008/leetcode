package com.leetcode;
/*806. Domino and Tromino Tiling*/ 
public class _806_DominoandTrominoTiling {
    public int[] numberOfLines(int[] widths, String S) {
        int sum = 0;
        int line = 0;
        for (int i = 0; i < S.length(); i++) {
            sum += widths[S.charAt(i) - 'a'];
            if (i != S.length() - 1 && sum + widths[S.charAt(i + 1) - 'a'] > 100) {
                sum = 0;
                line++;
            }
        }
        if (sum > 0) {
            line++;
        }
        return new int[]{line, sum};
    }
}