package com.leetcode.problem_1_500;

/*11. Container With Most Water*/
/*11. 盛最多水的容器
题目描述
评论 (502)
题解(158)New
提交记录

给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

说明：你不能倾斜容器，且 n 的值至少为 2。

图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。



示例:

输入: [1,8,6,2,5,4,8,3,7]
输出: 49

*/
public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;
        while (l != r) {
            int len = Math.min(height[l], height[r]);
            res = Math.max(len * (r - l), res);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        /*for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
            }
        }*/
        return res;
    }
}