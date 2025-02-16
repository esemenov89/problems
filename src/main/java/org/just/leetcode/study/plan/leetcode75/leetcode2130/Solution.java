package org.just.leetcode.study.plan.leetcode75.leetcode2130;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int pairSum(ListNode head) {
        int result = 0;
        int sizeOfListNode = 0;
        ListNode copyOfHead = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            sizeOfListNode++;
            head = head.next;
        }
        int index = 0;
        head = copyOfHead;
        while (head != null) {
            if (index < sizeOfListNode / 2) {
                map.put(index, head.val);
            } else {
                if (map.get(sizeOfListNode - index - 1) + head.val > result) {
                    result = map.get(sizeOfListNode - index - 1) + head.val;
                }
            }
            head = head.next;
            index++;
        }
        return result;
    }
}