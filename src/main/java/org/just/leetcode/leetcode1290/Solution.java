package org.just.leetcode.leetcode1290;

public class Solution {

    public int getDecimalValue(ListNode head) {
        int result;
        ListNode nextNode = head;
        StringBuilder sb = new StringBuilder();
        while (nextNode != null) {
            sb.append(nextNode.val);
            nextNode = nextNode.next;
        }
        result = Integer.parseInt(sb.toString(), 2);
        return result;
    }
}