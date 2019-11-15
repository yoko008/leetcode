package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*682. Baseball Game*/
public class _682_BaseballGame {
    public int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    sum += list.get(list.size() - 1) + list.get(list.size() - 2);
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                case "D":
                    sum += (list.get(list.size() - 1) * 2);
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "C":
                    sum -= list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    break;
                default:
                    sum += Integer.valueOf(ops[i]);
                    list.add(Integer.valueOf(ops[i]));
                    break;
            }
        }
        return sum;
    }
}