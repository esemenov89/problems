package org.just.leetcode.study.plan.leetcode75.leetcode206;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode copyOfHead = head;
        ListNode result = new ListNode(head.val);
        ListNode last = result;
        int sizeOfListNode = 1;
        int iterations = -1;
        int innerIterations = -1;
        while (iterations != 0) {
            while (innerIterations != 0) {
                head = head.next;
                sizeOfListNode++;
                innerIterations--;
                if (head.next == null || innerIterations == 1) {
                    if (iterations == -1) {
                        last.val = head.val;
                    } else {
                        last.next = new ListNode(head.val);
                        last = last.next;
                    }
                    break;
                }
            }
            if (iterations == -1) {
                iterations = sizeOfListNode - 1;
            } else {
                iterations--;
            }
            innerIterations = iterations;
            head = copyOfHead;
            if (innerIterations == 1) {
                last.next = new ListNode(head.val);
                break;
            }
        }
        return result;
    }
}