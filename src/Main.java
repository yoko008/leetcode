import com.leetcode.Solution;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        String str = "";
        int[] intArr = new int[]{-1,1,1,1,2,1};
        int[] intArr2 = new int[]{};
        String[] stringArr = new String[]{};
        String[] stringArr2 = new String[]{};
        int[][] intArrArr = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        long l = System.currentTimeMillis();
        printArr(new Solution().majorityElement(intArr));
        System.out.print("用时="+(System.currentTimeMillis()-l)+"ms");

    }

    public static void printArr(String[] arr){
        System.out.println(Arrays.toString(arr));
        System.out.println("length="+arr.length);
    }
    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
        System.out.println("length="+arr.length);
    }
    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("length="+arr.length);
    }
    public static void printArr(List list){
        System.out.println(list.toString());
    }
    public static void printArr(int num){
        System.out.println("int="+num);
    }
    public static void printArr(boolean tf){
        System.out.println("boolean="+tf);
    }

}
