package com.leetcode;

import com.definition.ListNode;

/*两数相加*/
/*给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
/*太可怕了，我之前转成数字直接相加结果测试用例有long都装不下的数字，吓死我了。*/
public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String resNum = "";
        int jinwei = 0;
        while (l1 != null || l2 != null) {
            int num = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + jinwei;
            if (num >= 10) {
                jinwei = 1;
                num = num - 10;
            } else {
                jinwei = 0;
            }
            resNum = num + resNum;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (jinwei == 1) {
            resNum = "1" + resNum;
        }
        ListNode res = new ListNode(0);
        for (int i = 0; i < resNum.length(); i++) {
            res.val = Integer.parseInt(resNum.substring(i, i + 1));
            if (i != resNum.length() - 1)
                res = add(res);
        }
        return res;
    }

    public ListNode add(ListNode res) {
        ListNode ret = new ListNode(0);
        ret.next = res;
        return ret;
    }
}
