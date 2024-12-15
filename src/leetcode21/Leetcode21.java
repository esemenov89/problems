package leetcode21;

public class Leetcode21 {

    public static void main(String[] args) {
        Leetcode21 leetcode = new Leetcode21();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        System.out.println(leetcode.mergeTwoLists(head, head));
        ListNode head2 = null;
        System.out.println(head2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return list1;
    }
}