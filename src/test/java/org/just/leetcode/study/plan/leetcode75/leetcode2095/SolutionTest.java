package org.just.leetcode.study.plan.leetcode75.leetcode2095;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void deleteMiddle(ListNode s, ListNode expected) {
        ListNode actual = solution.deleteMiddle(s);

        assertThat(actual, equalTo(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateListNode1(), generateListNode1Result()),
                Arguments.of(generateListNode2(), generateListNode2Result()),
                Arguments.of(generateListNode3(), generateListNode3Result()),
                Arguments.of(generateListNode4(), generateListNode4Result()),
                Arguments.of(new ListNode(1), null),
                Arguments.of(generateListNode(), new ListNode(1))
        );
    }

    private static ListNode generateListNode1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);
        return head;
    }

    private static ListNode generateListNode1Result() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(6);
        return head;
    }

    private static ListNode generateListNode2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        return head;
    }

    private static ListNode generateListNode2Result() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        return head;
    }

    private static ListNode generateListNode3() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        return head;
    }

    private static ListNode generateListNode3Result() {
        return new ListNode(2);
    }

    private static ListNode generateListNode4() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        return head;
    }

    private static ListNode generateListNode4Result() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        return head;
    }

    private static ListNode generateListNode() {
        ListNode head = new ListNode(1);
        ListNode last = head;
        for (int i = 0; i < 100000; i++) {
            last.next = new ListNode(i + 1);
            last = last.next;
        }
        return head;
    }
}