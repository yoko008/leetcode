package com.leetcode;
/*521. Longest Uncommon Subsequence I */ 
public class _521_LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if (a.length() == b.length()) {
            if (a.equals(b)) {
                return -1;
            } else {
                return a.length();
            }
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}