package com.leetcode.problem_1_500;
/*344. Reverse String*/ 
public class _344_ReverseString {
    public String reverseString(String s) {
        StringBuilder b = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            b.append(s.charAt(i));
        }
        return b.toString();
    }
}