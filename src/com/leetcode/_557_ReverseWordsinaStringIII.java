package com.leetcode;
/*557. Reverse Words in a String III*/ 
public class _557_ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder b = new StringBuilder();
        for (String x : arr) {
            for (int i = x.length() - 1; i >= 0; i--) {
                b.append(x.charAt(i));
            }
            b.append(" ");
        }
        return b.toString().trim();
    }
}