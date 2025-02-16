package org.just.leetcode.study.plan.leetcode75.leetcode2130;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void pairSum(ListNode s, int expected) {
        int actual = solution.pairSum(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of(generateListNode1(), 6),
                Arguments.of(generateListNode2(), 7),
                Arguments.of(generateListNode3(), 100001),
                Arguments.of(generateListNode4(), 11),
                Arguments.of(generateListNode(), 100001)
        );
    }

    private static ListNode generateListNode1() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        return head;
    }

    private static ListNode generateListNode2() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        return head;
    }

    private static ListNode generateListNode3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(100000);
        return head;
    }

    private static ListNode generateListNode4() {
        ListNode head = new ListNode(10);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next = new ListNode(1);
        return head;
    }

    private static ListNode generateListNode() {
        ListNode head = new ListNode(1);
        ListNode last = head;
        for (int i = 0; i < 5000 - 1; i++) {
            if (i == 0 || i == 5000 - 2) {
                last.next = new ListNode(100000);
            } else {
                last.next = new ListNode(1);
            }
            last = last.next;
        }
        return head;
    }
}