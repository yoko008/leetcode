package com.leetcode.problem_501_1000;

/*695. Max Area of Island*/
public class _695_MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int num = deepSearch(grid, i, j);
                    max = Math.max(num, max);
                }
            }
        }
        return max;
    }

    public int deepSearch(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            int num = 1 + deepSearch(grid, i - 1, j) + deepSearch(grid, i + 1, j) + deepSearch(grid, i, j - 1) + deepSearch(grid, i, j + 1);
            return num;
        } else
            return 0;
    }
}