package org.just.leetcode.leetcode21;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode nextNode = next;
        StringBuilder s = new StringBuilder("[" + this.val + "");
        while (nextNode != null) {
            s.append(",").append(nextNode.val);
            nextNode = nextNode.next;
        }
        return s.toString() + "]";
    }
}