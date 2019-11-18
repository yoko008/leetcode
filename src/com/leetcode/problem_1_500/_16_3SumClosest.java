package com.leetcode.problem_1_500;

/*16. 3Sum Closest*/
/*给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/3sum-closest
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class _16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        int resint = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[k] + nums[j] - target;
                    num = num >= 0 ? num : num * -1;
                    if (num<res){
                       res = num;
                       resint = nums[i] + nums[k] + nums[j];
                    }
                }
            }
        }
        return resint;
    }
}