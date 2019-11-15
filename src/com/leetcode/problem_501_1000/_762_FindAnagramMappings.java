package com.leetcode.problem_501_1000;
/*762. Find Anagram Mappings*/ 
public class _762_FindAnagramMappings {
    public int countPrimeSetBits(int L, int R) {
        int returnnum = 0;
        for (int i = L; i <= R; i++) {
            String str = "";
            int num = i;
            int num1 = 0;
            boolean tf = true;
            while (num > 0) {
                str = num % 2 + str;
                num /= 2;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    num1++;
                }
            }
            if (num1 == 1) {
                tf = false;
            } else {
                for (int j = 2; j < num1; j++) {
                    if (num1 % j == 0) {
                        tf = false;
                    }
                }
            }
            if (tf) {
                returnnum++;
            }
        }
        return returnnum;
    }
}