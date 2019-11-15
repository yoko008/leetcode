package com.leetcode.problem_1_500;

import java.util.ArrayList;
import java.util.List;

/*118. Pascal's Triangle*/
public class _118_Pascal_sTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            }
            if (i == 1) {
                list.add(1);
                list.add(1);
            }
            if (i > 1) {
                list.add(1);
                for (int j = 0; j < lists.size() - 1; j++) {
                    list.add(lists.get(i - 1).get(j) + lists.get(i - 1).get(j + 1));
                }
                list.add(1);
            }
            lists.add(list);
        }
        return lists;
    }
}