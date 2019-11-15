package com.leetcode.problem_501_1000;

import java.util.HashSet;
import java.util.Set;

/*804. Rotated Digits*/
public class _804_RotatedDigits {
    public int uniqueMorseRepresentations(String[] words) {
        String[] pass = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> a = new HashSet<>();
        for (String x : words) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < x.length(); i++) {
                sb.append(pass[(int) x.charAt(i) - 97]);
            }
            a.add(sb.toString());
        }
        return a.size();
    }
}