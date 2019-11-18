package com.leetcode;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        List<Integer> list1 = new LinkedList();
        List<Integer> list2 = new LinkedList();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 3 == 0) {
                sum += nums[i];
            } else if (nums[i] % 3 == 1) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            if (i % 3 == 2) {
                int s = list1.get(i - 2) + list1.get(i - 1) + list1.get(i);
                int s2=0;
                if (list2.size()>0){
                    s2 = list1.get(i-2)+list2.get(0);
                }
                if (s>=s2){
                    sum+=s;
                }
                else {
                    sum+=s2;
                    list2.remove(0);
                }
            }
        }

        return sum;
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List listlian = new LinkedList();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                listlian.add(grid[i][j]);
            }
        }
        k = k % (grid.length * grid[0].length);
        List listlian2 = new LinkedList();
        int s = k - 1;
        if (k == 0) {
            listlian2 = listlian;
        } else {
            s = grid.length * grid[0].length - k;
            for (int i = s; i != s - 1; i++) {
                listlian2.add(listlian.get(i));
                if (i == listlian.size() - 1) {
                    i = -1;
                }
            }
            listlian2.add(listlian.get(s - 1));
        }
        List res = new LinkedList();
        List list = new LinkedList();
        for (int i = 0; i < listlian2.size(); i++) {
            list.add(listlian2.get(i));
            if ((i + 1) % grid[0].length == 0) {
                res.add(list);
                list = new LinkedList();
            }
        }
        return res;
    }

    public String encode(int num) {
        int i = 0;
        double a = num;
        while (a - Math.pow(2, i) >= 0) {
            a = a - Math.pow(2, i);
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 31; j >= 0; j--)
            stringBuilder.append((int) a >>> j & 1);
        String res = stringBuilder.toString();
        res = res.substring(res.length() - i);
        return res;
    }

    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        List a = new ArrayList();
        a.add("Earth");
        a.add("North America");
        a.add("South America");
        regions.add(a);
        a = new ArrayList();
        a.add("North America");
        a.add("United States");
        a.add("Canada");
        regions.add(a);
        a = new ArrayList();
        a.add("United States");
        a.add("New York");
        a.add("Boston");
        regions.add(a);
        a = new ArrayList();
        a.add("Canada");
        a.add("Ontario");
        a.add("Quebec");
        regions.add(a);
        a = new ArrayList();
        a.add("South America");
        a.add("Brazil");
        regions.add(a);
        region1 = "Quebec";
        region2 = "New York";
        List list1 = new ArrayList();
        list1.add(region1);
        List list2 = new ArrayList();
        list2.add(region2);
        for (int i = 0; i < regions.size(); i++) {
            boolean nomore1 = false;
            boolean nomore2 = false;
            for (int j = 1; j < regions.get(i).size(); j++) {
                if (region1.equals(regions.get(i).get(j))) {
                    list1.add(regions.get(i).get(0));
                    region1 = regions.get(i).get(0);
                    nomore1 = true;
                }
                if (region2.equals(regions.get(i).get(j))) {
                    list2.add(regions.get(i).get(0));
                    region2 = regions.get(i).get(0);
                    nomore2 = true;
                }
                if (nomore1 || nomore2) {
                    break;
                }
            }
            if (nomore1 || nomore2) {
                i = -1;
            }
        }
        String res = "";
        back:
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    res = list1.get(i).toString();
                    break back;
                }
            }
        }
        return res;
    }

    public int oddCells(int n, int m, int[][] indices) {
        int[][] arr = new int[m][n];
        int res = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int cloum = indices[i][1];
            for (int j = 0; j < arr.length; j++) {
                arr[j][row] += 1;
            }
            for (int j = 0; j < arr[cloum].length; j++) {
                arr[cloum][j] += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0;
        int sum2 = 0;
        List list = new LinkedList();
        for (int i = 0; i < colsum.length; i++) {
            sum += colsum[i];
            if (colsum[i] == 2) {
                sum2++;
            }
        }
        if (sum != upper + lower || sum2 > upper || sum2 > lower) {
            return list;
        }
        List u = new LinkedList();
        List l = new LinkedList();
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 2) {
                u.add(1);
                upper--;
                l.add(1);
                lower--;
            }
            if (colsum[i] == 1) {
                if (upper > lower) {
                    u.add(1);
                    upper--;
                    l.add(0);
                } else {
                    l.add(1);
                    lower--;
                    u.add(0);
                }
            }
            if (colsum[i] == 0) {
                u.add(0);
                l.add(0);
            }
        }
        list.add(u);
        list.add(l);
        return list;
    }

}