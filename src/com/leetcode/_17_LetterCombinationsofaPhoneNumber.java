package com.leetcode;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*17. Letter Combinations of a Phone Number*/
/**给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

示例:

输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

说明:
尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class _17_LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> res = new LinkedList<>();
        String s = pin("",digits,map);
        return null;
    }

    public String pin(String s,String digits,Map<Character,String> map){
        if (digits.isEmpty()){
            return "";
        }
        for (int i = 0; i < map.get(digits.charAt(0)).length(); i++) {
            s = s + map.get(digits.charAt(0)).charAt(i)+pin("",digits.substring(1),map);
        }
        return s;
    }

}