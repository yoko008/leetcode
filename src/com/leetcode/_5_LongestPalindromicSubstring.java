package com.leetcode;

/*5. Longest Palindromic Substring*/
/*5. 最长回文子串
题目描述
评论 (1.2k)
题解(205)New
提交记录

给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。

示例 2：

输入: "cbbd"
输出: "bb"

*/
public class _5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }
        String str;
        String res = String.valueOf(s.charAt(0));
        int pianyi = 1;
        int jishu = 0;
        for (int i = s.length() / 2; i < s.length(); i += jishu) {
            str = s.charAt(i) + "";
            while (i - pianyi >= 0 && i + pianyi < s.length() && s.charAt(i - pianyi) == s.charAt(i + pianyi)) {
                str = s.charAt(i - pianyi) + str + s.charAt(i + pianyi);
                pianyi++;
            }
            res = res.length() > str.length() ? res : str;
            pianyi = 1;
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                str = s.charAt(i) + "" + s.charAt(i + 1);
                while (i - pianyi >= 0 && i + 1 + pianyi < s.length() && s.charAt(i - pianyi) == s.charAt(i + 1 + pianyi)) {
                    str = s.charAt(i - pianyi) + str + s.charAt(i + 1 + pianyi);
                    pianyi++;
                }
                res = res.length() > str.length() ? res : str;
                pianyi = 1;
            }
            if (res.length() == s.length()) {
                break;
            }
            jishu = jishu * -1;
            if (jishu <= 0) {
                jishu -= 1;
            } else {
                jishu += 1;
            }
        }
        return res;
    }
}