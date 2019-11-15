package com.leetcode.problem_501_1000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*811. Number of Subarrays with Bounded Maximum*/
public class _811_NumberofSubarrayswithBoundedMaximum {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] a = cpdomains[i].split(" ");
            String[] b = a[1].split("\\.");
            String str = "";
            for (int j = b.length - 1; j >= 0; j--) {
                if (j == b.length - 1)
                    str = b[j] + str;
                else
                    str = b[j] + "." + str;
                if (map.get(str) == null || "".equals(map.get(str))) {
                    map.put(str, Integer.valueOf(a[0]));
                } else {
                    map.put(str, Integer.valueOf(a[0]) + map.get(str));
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue() + " " + entry.getKey());
        }
        return list;
    }
}