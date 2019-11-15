package com.leetcode.problem_1_500;
/*476. Number Complement*/ 
public class _476_NumberComplement {
    public int findComplement(int num) {
        int n = 0;
        int c = 0;
        if (num == 0) {
            c = 1;
        }
        while (num > 0) {
            if (num % 2 == 0)
                c = c + (1 << n);
            num = num / 2;
            n++;
        }
        return c;
    }
}