package com.leetcode;
/*389. Find the Difference*/ 
public class _389_FindtheDifference {
    public char findTheDifference(String s, String t) {
        char num = 0;
        for (char schar : s.toCharArray()) {
            num -= schar;
        }
        for (char tchar : t.toCharArray()) {
            num += tchar;
        }
        return num;
    }
}