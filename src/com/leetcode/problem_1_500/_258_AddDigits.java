package com.leetcode.problem_1_500;
/*258. Add Digits*/ 
public class _258_AddDigits {
    public int addDigits(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        sum += num;
        if (sum < 10)
            return sum;
        else
            return addDigits(sum);
    }
}