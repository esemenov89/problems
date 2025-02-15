package org.just.leetcode.study.plan.leetcode75.leetcode206;

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        return result;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(head.val);
        ListNode even = new ListNode(head.next.val);
        ListNode lastResult = result;
        ListNode lastEven = even;
        int index = 0;
        while (head != null) {
            if (index != 0 && index % 2 == 0) {
                lastResult.next = new ListNode(head.val);
                lastResult = lastResult.next;
            }
            if (index != 1 && index % 2 == 1) {
                lastEven.next = new ListNode(head.val);
                lastEven = lastEven.next;
            }
            head = head.next;
            index++;
        }
        lastResult.next = even;
        return result;
    }
}