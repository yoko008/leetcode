package com.leetcode.problem_1_500;

import com.definition.ListNode;

import java.util.LinkedList;
import java.util.List;

/*19. Remove Nth Node From End of List*/
/*19. 删除链表的倒数第N个节点
题目描述
评论 (751)
题解(228)New
提交记录

给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.

说明：

给定的 n 保证是有效的。

进阶：

你能尝试使用一趟扫描实现吗？
*/
public class _19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode res = new ListNode(0);
        int s = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (s == n) {
                s++;
                if (i == 0) {
                    res = res.next;
                }
                continue;
            }
            res.val = list.get(i);
            if (i != 0) {
                ListNode linshi = new ListNode(0);
                linshi.next = res;
                res = linshi;
            }
            s++;
        }
        return res;
    }
}