package com.leetcode;
/*463. Island Perimeter*/ 
public class _463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int landBoxNumber = 0;
        int chonghebianjie = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    landBoxNumber++;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        chonghebianjie++;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        chonghebianjie++;
                    }
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        chonghebianjie++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        chonghebianjie++;
                    }
                }
            }
        }
        return landBoxNumber * 4 - chonghebianjie;
    }
}