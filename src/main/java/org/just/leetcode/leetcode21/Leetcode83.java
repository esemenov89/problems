package org.just.leetcode.leetcode21;

public class Leetcode83 {

/*    Input: head = [1,1,2]
    Output: [1,2]

    Input: head = [1,1,2,3,3]
    Output: [1,2,3]*/

    public static void main(String[] args) {
        Leetcode83 leetcode = new Leetcode83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);

        ListNode head3 = null;

        System.out.println(leetcode.deleteDuplicates(head));
        System.out.println(leetcode.deleteDuplicates(head2));
        System.out.println(leetcode.deleteDuplicates(head3));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(-1000);
        ListNode last = result;
        int lastVal = -1000;
        while (head != null) {
            if (last.val != head.val && head.val != lastVal) {
                if (last.val == -1000) {
                    last.val = head.val;
                } else {
                    last.next = new ListNode(head.val);
                    last = last.next;
                }
            }
            lastVal = head.val;
            head = head.next;
        }
        return result;
    }
}