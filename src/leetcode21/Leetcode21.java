package leetcode21;

import java.util.List;

public class Leetcode21 {

    public static void main(String[] args) {
        Leetcode21 leetcode = new Leetcode21();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        System.out.println(leetcode.mergeTwoLists(head, head2));
/*        ListNode result = new ListNode();
        ListNode pointer = result;
        for (int i = 0; i < 100; i++){
            insert(result, i);
        }
        System.out.println(result);*/
  /*      Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]*/
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode(0);
        ListNode last = result;
        ListNode head = list1;
        ListNode head2 = list2;
        boolean first = true;
        while (head != null && head2 != null) {
            if (head.val == head2.val) {
                if (!first) {
                    last.next = new ListNode(head.val);
                    last = last.next;
                }
                head = head.next;
                last.next = new ListNode(head2.val);
                head2 = head2.next;
                last = last.next;
            } else if (head.val > head2.val) {
                last.next = new ListNode(head2.val);
                head2 = head2.next;
                last = last.next;
            } else {
                last.next = new ListNode(head.val);
                head = head.next;
                last = last.next;
            }
            if (first) {
                first = false;
            }
        }
        return result;
    }
/*            while (head.next != null && head2.next != null) {
        pointer.val = head.val;
        pointer.next = new ListNode(head.val);
        pointer = pointer.next;
        pointer.next = new ListNode(head2.val);
        head2 = head2.next;
        pointer = pointer.next;
    }*/

    private static ListNode insert(ListNode list, int data)
    {
        ListNode newNode = new ListNode(data);
        if (list.next == null) {
            list.next = newNode;
        }
        else {
            ListNode last = list.next;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
}