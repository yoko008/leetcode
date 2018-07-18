package com.leetcode;

import java.math.BigInteger;
import java.util.*;

public class Solution {
    /**
     * 9. 回文数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    /**
     * 13. 罗马数字转整数
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if (i<s.length()-1&&(map.get(s.charAt(i+1))/map.get(s.charAt(i))==5||map.get(s.charAt(i+1))/map.get(s.charAt(i))==10)){
                sum -= map.get(s.charAt(i));
            }
            else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    /**
     * 119. 杨辉三角 II
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            if (i==0){
                list.add(1);
            }
            if (i==1){
                list.add(1);
                list.add(1);
            }
            if (i>1){
                list.add(1);
                for (int j = 0; j < lists.size()-1; j++) {
                    list.add(lists.get(i-1).get(j)+lists.get(i-1).get(j+1));
                }
                list.add(1);
            }
            lists.add(list);
        }
        return lists.get(lists.size());
    }
    /**
     * 136. 只出现一次的数字
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n : nums){
            result = n^result;
        }
        return result;
    }
    /**
     * 杨辉三角
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i==0){
                list.add(1);
            }
            if (i==1){
                list.add(1);
                list.add(1);
            }
            if (i>1){
                list.add(1);
                for (int j = 0; j < lists.size()-1; j++) {
                    list.add(lists.get(i-1).get(j)+lists.get(i-1).get(j+1));
                }
                list.add(1);
            }
            lists.add(list);
        }
        return lists;
    }

    /**
     * 169. 求众数
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    num++;
                }
                else {
                    if (num > nums.length/2){
                        return nums[i];
                    }
                    i = j-1;
                    num = 1;
                    break;
                }
            }
        }
        return nums[nums.length-1];
    }
    /**
     * 171. Excel表列序号
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int sum = 0;
        int xishu = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            sum += ((int)s.charAt(i) - 64)*xishu;
            xishu *= 26;
        }
        return sum;
    }

    /**
     * 258. 各位相加
     * @param num
     * @return
     */
    public int addDigits(int num) {
        int sum = 0;
        while (num>9) {
            sum += num % 10;
            num /= 10;
        }
        sum += num;
        if (sum<10)
            return sum;
        else
            return addDigits(sum);
    }

    /**
     * 283. 移动零
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        nums = new int[]{0,0,1};
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length-1; j++) {
                    int a = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    /**
     * 292. Nim游戏
     * @param n
     * @return
     */
    public boolean canWinNim(int n) {
        return !(n%4==0);
    }
    /**
     * 344. 反转字符串
     * @param s
     * @return
     */
    public String reverseString(String s) {
        StringBuilder b = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            b.append(s.charAt(i));
        }
        return b.toString();
    }

    /**
     * 371. 两整数之和
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        BigInteger a1= BigInteger.valueOf(a);
        BigInteger b1= BigInteger.valueOf(b);
        BigInteger c1= a1.add(b1);
        return Integer.parseInt(c1.toString());
    }

    /**
     * 412. Fizz Buzz
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }
            else if (i%3==0){
                list.add("Fizz");
            }
            else if (i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    /**
     * 463. 岛屿的周长
     * @param grid
     * @return
     */
    public int islandPerimeter(int[][] grid) {
        int landBoxNumber = 0;
        int chonghebianjie = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1){
                    landBoxNumber++;
                    if (i > 0 && grid[i-1][j] == 1){
                        chonghebianjie++;
                    }
                    if (j > 0 && grid[i][j-1] == 1){
                        chonghebianjie++;
                    }
                    if (i < grid.length-1 && grid[i+1][j] == 1){
                        chonghebianjie++;
                    }
                    if (j < grid[i].length-1 && grid[i][j+1] == 1){
                        chonghebianjie++;
                    }
                }
            }
        }
        return landBoxNumber * 4 - chonghebianjie;
    }
    /**
     * 476. 数字的补数
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int n = 0;
        int c = 0;
        if (num == 0){
            c = 1;
        }
        while (num>0){
            if(num%2==0)
            c = c + (1<<n);
            num = num / 2;
            n++;
        }
        return c;
    }

    /**
     * 496. 下一个更大元素 I
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            boolean tf = false;
            int num = nums1[i];
            nums1[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (num==nums2[j]){
                    tf = true;
                }
                if (tf&&num<nums2[j]){
                    nums1[i]=nums2[j];
                    break;
                }
            }
        }
        return nums1;
    }
    /**
     * 500. 键盘行
     * @param words
     * @return
     */
    public String[] findWords(String[] words) {
        String keyBroad1 = "qwertyuiop";
        String keyBroad2 = "asdfghjkl";
        String keyBroad3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String str:words) {
            int a = 0,b = 0,c = 0;
            for (char x : str.toCharArray()) {
                if(keyBroad1.indexOf(String.valueOf(x).toLowerCase()) != -1)
                    a = 1;
                if(keyBroad2.indexOf(String.valueOf(x).toLowerCase()) != -1)
                    b = 1;
                if(keyBroad3.indexOf(String.valueOf(x).toLowerCase()) != -1)
                    c = 1;
            }
            if (a + b + c == 1)
                list.add(str);
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    /**
     * 520. 检测大写字母
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        if (word.length()==1){
            return true;
        }
        if (word.charAt(0)>='a'&&word.charAt(0)<='z'){
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                    return false;
                }
            }
        }
        if (word.charAt(0)>='A'&&word.charAt(0)<='Z'){
            if (word.charAt(1)>='a'&&word.charAt(1)<='z'){
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                        return false;
                    }
                }
            }
            if (word.charAt(1)>='A'&&word.charAt(1)<='Z'){
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i)>='a'&&word.charAt(i)<='z'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    /**
     * 521. 最长特殊序列 Ⅰ
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {
        if (a.length()==b.length()){
            if (a.equals(b)){
                return -1;
            }
            else {
                return a.length();
            }
        }
        else {
            return Math.max(a.length(),b.length());
        }
    }
    /**
     * 557. 反转字符串中的单词 III
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder b = new StringBuilder();
        for (String x:arr) {
            for (int i = x.length()-1; i >=0; i--) {
                b.append(x.charAt(i));
            }
            b.append(" ");
        }
        return b.toString().trim();
    }

    /**
     * 561. 数组拆分 I
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
       /* for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    int change = nums[i];
                    nums[i] = nums[j];
                    nums[j] = change;
                }
            }
        }*/
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * 566. 重塑矩阵
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length*nums[0].length != r*c){
            return nums;
        }
        else{
            int[][] newnums = new int[r][c];
            int[] n = new int[nums.length*nums[0].length];
            int num = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    n[num] = nums[i][j];
                    num++;
                }
            }
            num = 0;
            for (int i = 0; i < newnums.length; i++) {
                for (int j = 0; j < newnums[i].length; j++) {
                    newnums[i][j] = n[num];
                    num++;
                }
            }
            return newnums;
        }

    }
    /**
     * 575. 分糖果
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        int n=candies.length/2;
        for(int i:candies) {
            set.add(i);
        }
        int d=set.size();
        return d>n?n:d;
    }
    /**
     * 682. 棒球比赛
     * @param ops
     * @return
     */
    public int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]){
                case "+":
                    sum += list.get(list.size()-1)+list.get(list.size()-2);
                    list.add(list.get(list.size()-1)+list.get(list.size()-2));
                    break;
                case "D":
                    sum += (list.get(list.size()-1)*2);
                    list.add(list.get(list.size()-1)*2);
                    break;
                case "C":
                    sum -= list.get(list.size()-1);
                    list.remove(list.size()-1);
                    break;
                default:
                    sum += Integer.valueOf(ops[i]);
                    list.add(Integer.valueOf(ops[i]));
                    break;
            }
        }
        return sum;
    }
    /**
     * 693. 交替位二进制数
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        int yu=-1;
        while (n>0){
            if(yu==n%2){
                return false;
            }
            yu = n%2;
            n = n/2;
        }
        return true;
    }

    /**
     * 695. 岛屿的最大面积
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    int num = deepSearch(grid,i,j);
                    max = Math.max(num,max);
                }
            }
        }
        return max;
    }
    public int deepSearch(int[][] grid,int i,int j){
        if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j] == 1){
            grid[i][j]=0;
            int num = 1 + deepSearch(grid,i-1,j) + deepSearch(grid,i+1,j) + deepSearch(grid,i,j-1) + deepSearch(grid,i,j+1);
            return num;
        }else
            return 0;
    }
    /**
     * 728. 自除数
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean a = true;
            for (int j = 0; j < (i+"").length(); j++) {
                if((i+"").charAt(j)=='0'||i%Integer.parseInt((i+"").charAt(j)+"")!=0){
                    a = false;
                    break;
                }
            }
            if (a)
                list.add(i);
        }
        return list;
    }

    /**
     * 762. 二进制表示中质数个计算置位
     * @param L
     * @param R
     * @return
     */
    public int countPrimeSetBits(int L, int R) {
        int returnnum = 0;
        for (int i = L; i <= R; i++) {
            String str = "";
            int num = i;
            int num1 = 0;
            boolean tf = true;
            while (num>0){
                str = num % 2 +str;
                num /= 2;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)=='1'){
                    num1++;
                }
            }
            if (num1==1){
                tf = false;
            }
            else{
                for (int j = 2; j < num1; j++) {
                    if (num1%j==0){
                        tf = false;
                    }
                }
            }
            if (tf){
                returnnum++;
            }
        }
        return returnnum;
    }
    /**
     * 766. 托普利茨矩阵
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean tf = true;
        for (int i = 0; i < matrix.length-1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix[0].length && i+j < matrix.length; j++) {
                set.add(matrix[i+j][j]);
            }
            if (set.size()!=1){
                tf = false;
            }
        }
        for (int i = 0; i < matrix[0].length-1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix.length && i+j < matrix[0].length; j++) {
                set.add(matrix[j][i+j]);
            }
            if (set.size()!=1){
                tf = false;
            }
        }
        return tf;
    }
    /**
     * 804. 唯一摩尔斯密码词
     * @param words
     * @return
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] pass = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> a= new HashSet<>();
        for (String x: words) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < x.length(); i++) {
                sb.append(pass[(int)x.charAt(i)-97]);
            }
            a.add(sb.toString());
        }
        return a.size();
    }

    /**
     * 806. 写字符串需要的行数
     * @param widths
     * @param S
     * @return
     */
    public int[] numberOfLines(int[] widths, String S) {
        int sum = 0;
        int line = 0;
        for (int i = 0; i < S.length(); i++) {
            sum+=widths[S.charAt(i)-'a'];
            if (i!=S.length()-1&&sum + widths[S.charAt(i+1)-'a']>100){
                sum = 0;
                line++;
            }
        }
        if (sum>0){
            line++;
        }
        return new int[]{line,sum};
    }
    /**
     * 811. 子域名访问计数
     * @param cpdomains
     * @return
     */
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] a = cpdomains[i].split(" ");
            String[] b = a[1].split("\\.");
            String str = "";
            for (int j = b.length-1; j >= 0 ; j--) {
                if (j==b.length-1)
                    str = b[j]+str;
                else
                    str = b[j]+"."+str;
                if (map.get(str)==null||"".equals(map.get(str))){
                    map.put(str,Integer.valueOf(a[0]));
                }
                else {
                    map.put(str,Integer.valueOf(a[0])+map.get(str));
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry.getValue()+" "+entry.getKey());
        }
        return list;
    }
    /**
     * 821. 字符的最短距离
     * @param S
     * @param C
     * @return
     */
    public int[] shortestToChar(String S, char C) {
        int[] intArr = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if ((i-j>=0&&S.charAt(i-j)==C)||(i+j<S.length()&&S.charAt(i+j)==C)){
                    intArr[i] = j;
                    break;
                }
            }
        }
        return intArr;
    }
    /**
     * 832. 翻转图像
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length/2; j++) {
                int a = A[i][j];
                A[i][j] = A[i][A[i].length-j-1];
                A[i][A[i].length-j-1] = a;
            }
            for (int j = 0; j < A[i].length; j++) {
                if(A[i][j] == 0)
                    A[i][j] = 1;
                else if(A[i][j] == 1)
                    A[i][j] = 0;
            }
        }
        return A;
    }

    /**
     * 852. 山脉数组的峰顶索引
     * @param A
     * @return
     */
    public int peakIndexInMountainArray(int[] A) {
        int a = 0;
        for (int i = 1; i < A.length-1; i++) {
            if (A[i-1]<A[i]&&A[i]>A[i+1]){
                a = i;
            }
        }
        return a;
    }

    /**
     * 868. 转置矩阵
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int [][] arr = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                arr[i][j] = A[j][i];
            }
        }
        return arr;
    }

}
