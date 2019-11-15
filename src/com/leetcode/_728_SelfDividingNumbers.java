package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*728. Self Dividing Numbers*/
public class _728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean a = true;
            for (int j = 0; j < (i + "").length(); j++) {
                if ((i + "").charAt(j) == '0' || i % Integer.parseInt((i + "").charAt(j) + "") != 0) {
                    a = false;
                    break;
                }
            }
            if (a)
                list.add(i);
        }
        return list;
    }
}