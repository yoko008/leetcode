package com.leetcode;

/*14. 最长公共前缀
题目描述
评论 (1.1k)
题解(213)New
提交记录

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"

示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
*/
public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int i = Integer.MAX_VALUE;
        for (String str : strs) {
            i = Math.min(str.length(), i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        bgm:
        for (int j = 0; j < i; j++) {
            char a = strs[0].charAt(j);
            for (int k = 1; k < strs.length; k++) {
                if (strs[k].charAt(j) != a) {
                    break bgm;
                }
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }
}
