package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*20. 有效的括号
题目描述
评论 (1.3k)
题解(329)New
提交记录

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。
示例 1:

输入: "()"
输出: true

示例 2:

输入: "()[]{}"
输出: true

示例 3:

输入: "(]"
输出: false

示例 4:

输入: "([)]"
输出: false

示例 5:

输入: "{[]}"
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class _20_ValidParentheses {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                list.add(s.charAt(i));
            } else {
                if (list.size() == 0 || list == null) {
                    return false;
                }
                if ((s.charAt(i) == ')' && list.get(list.size() - 1) == '(') || (s.charAt(i) == ']' && list.get(list.size() - 1) == '[') || (s.charAt(i) == '}' && list.get(list.size() - 1) == '{')) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            }
            if (list.size() > s.length() / 2) {
                return false;
            }
        }
        if (list.size() > 0) {
            return false;
        }
        return true;
    }
}
