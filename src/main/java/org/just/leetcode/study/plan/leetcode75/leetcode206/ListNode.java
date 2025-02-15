package org.just.leetcode.study.plan.leetcode75.leetcode206;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}