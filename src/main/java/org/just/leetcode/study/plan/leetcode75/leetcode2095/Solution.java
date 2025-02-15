package org.just.leetcode.study.plan.leetcode75.leetcode2095;

public class Solution {

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode result = new ListNode(head.val);
        ListNode pointer = head;
        int listNodeSize = 0;
        int middleIndex;
        while (pointer != null) {
            pointer = pointer.next;
            listNodeSize++;
        }
        middleIndex = listNodeSize / 2;
        ListNode last = result;
        int index = 0;
        while (head != null) {
            if (index == 0) {
                last.val = head.val;
                head = head.next;
                index++;
            }
            if (index == middleIndex) {
                head = head.next;
            }
            if (middleIndex == listNodeSize - 1 && index == middleIndex) {
                break;
            }
            last.next = new ListNode(head.val);
            last = last.next;
            head = head.next;
            index++;
        }

        return result;
    }
}