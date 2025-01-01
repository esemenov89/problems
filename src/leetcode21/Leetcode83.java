package leetcode21;

public class Leetcode83 {

    public static void main(String[] args) {
        Leetcode83 leetcode = new Leetcode83();
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        System.out.println(leetcode.mergeTwoLists(head, head2));

        head = new ListNode(2);
        head2 = new ListNode(1);
        System.out.println(leetcode.mergeTwoLists(head, head2));
    }

    public ListNode deleteDuplicates(ListNode head) {

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
                if (first) {
                    last.val = head.val;
                } else {
                    last.next = new ListNode(head.val);
                    last = last.next;
                }
                last.next = new ListNode(head2.val);
                head = head.next;
                head2 = head2.next;
                last = last.next;
            } else if (head.val > head2.val) {
                if (first) {
                    last.val = head2.val;
                } else {
                    last.next = new ListNode(head2.val);
                    last = last.next;
                }
                head2 = head2.next;
            } else {
                if (first) {
                    last.val = head.val;
                } else {
                    last.next = new ListNode(head.val);
                    last = last.next;
                }
                head = head.next;
            }
            if (first) {
                first = false;
            }
        }
        if (head != null) {
            while (head != null) {
                last.next = new ListNode(head.val);
                last = last.next;
                head = head.next;
            }
        }
        if (head2 != null) {
            while (head2 != null) {
                last.next = new ListNode(head2.val);
                last = last.next;
                head2 = head2.next;
            }
        }
        return result;
    }
}