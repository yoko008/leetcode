package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*119. Pascal's Triangle II*/
public class _119_Pascal_sTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
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
        return lists.get(lists.size());
    }
}