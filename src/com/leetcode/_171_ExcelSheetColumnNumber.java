package com.leetcode;
/*171. Excel Sheet Column Number*/ 
public class _171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0;
        int xishu = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += ((int) s.charAt(i) - 64) * xishu;
            xishu *= 26;
        }
        return sum;
    }
}