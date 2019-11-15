package com.leetcode.problem_1_500;

/*66. Plus One*/
/*66. 加一
题目描述
评论 (986)
题解(242)New
提交记录

给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。*/
public class _66_PlusOne {
    public int[] plusOne(int[] digits) {
        int jinwei = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (jinwei == 1) {
                if (digits[i] + jinwei < 10) {
                    digits[i] += jinwei;
                    jinwei = 0;
                } else {
                    digits[i] = 0;
                    jinwei = 1;
                }
            } else {
                break;
            }
        }
        if (jinwei == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++) {
                res[i] = digits[i - 1];
            }
            return res;
        }
        return digits;
    }
}