import com.definition.*;
import com.leetcode.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        long l = System.currentTimeMillis();
        /*ListNode a = new _2_AddTwoNumbers().addTwoNumbers(l1, l2);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }*/
        /*System.out.println(new _3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));*/
        //System.out.println(new Solution().oddCells(2,2,new int[][]{{1,1},{0,0}}));
//        System.out.println(new Solution().reconstructMatrix(9,2,new int[]{0,1,2,0,0,0,0,0,0,2,1,2,1,2}));
//        System.out.println(new _7_ReverseInteger().reverse(-2100000009));
//        System.out.println(new _8_StringtoIntegerAtoi().myAtoi("   +"));
//        System.out.println(new _12_IntegerToRoman().intToRoman(3999));
//        System.out.println(new _14_LongestCommonPrefix().longestCommonPrefix(new String[]{""}));
        System.out.println(new _20_ValidParentheses().isValid(""));
        System.out.println("用时=" + (System.currentTimeMillis() - l) + "ms");
    }

    public static void printArr(String[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println("length=" + arr.length);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println("length=" + arr.length);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("length=" + arr.length);
    }

    public static void printArr(List list) {
        System.out.println(list.toString());
    }

    public static void printArr(int num) {
        System.out.println("int=" + num);
    }

    public static void printArr(char ch) {
        System.out.println("char=" + ch);
    }

    public static void printArr(boolean tf) {
        System.out.println("boolean=" + tf);
    }

}
