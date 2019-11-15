package com.leetcode.problem_1_500;

import java.util.HashMap;
import java.util.Map;

/*13. Roman to Integer*/
public class _13_RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i < s.length() - 1 && (map.get(s.charAt(i + 1)) / map.get(s.charAt(i)) == 5 || map.get(s.charAt(i + 1)) / map.get(s.charAt(i)) == 10)) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}