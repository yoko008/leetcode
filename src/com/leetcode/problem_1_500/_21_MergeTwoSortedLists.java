package com.leetcode.problem_1_500;

import com.definition.ListNode;

import java.util.ArrayList;
import java.util.List;

/*21. Merge Two Sorted Lists*/
/*21. 合并两个有序链表
题目描述
评论 (710)
题解(174)New
提交记录

将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

*/
public class _21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        List<Integer> list = new ArrayList();
        while (l1.next != null || l2.next != null) {
            if (l1 == null) {
                list.add(l2.val);
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                list.add(l1.val);
                l1 = l1.next;
                continue;
            }
            if (l1.val <= l2.val) {
                list.add(l1.val);
                l1 = l1.next;
            } else {
                list.add(l2.val);
                l2 = l2.next;
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            res.val = list.get(i);
            if (i != 0) {
                ListNode linshi = new ListNode(0);
                linshi.next = res;
                res = linshi;
            }
        }
        return res;
    }
}