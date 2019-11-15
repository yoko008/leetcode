package com.leetcode.problem_1_500;

import java.util.ArrayList;
import java.util.List;

/*500. Keyboard Row*/
public class _500_KeyboardRow {
    public String[] findWords(String[] words) {
        String keyBroad1 = "qwertyuiop";
        String keyBroad2 = "asdfghjkl";
        String keyBroad3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String str : words) {
            int a = 0, b = 0, c = 0;
            for (char x : str.toCharArray()) {
                if (keyBroad1.indexOf(String.valueOf(x).toLowerCase()) != -1)
                    a = 1;
                if (keyBroad2.indexOf(String.valueOf(x).toLowerCase()) != -1)
                    b = 1;
                if (keyBroad3.indexOf(String.valueOf(x).toLowerCase()) != -1)
                    c = 1;
            }
            if (a + b + c == 1)
                list.add(str);
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }
}