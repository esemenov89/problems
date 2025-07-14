package org.just.leetcode.leetcode1290;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(ListNode arg1, int expected) {
        int actual = solution.getDecimalValue(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateListNode1(), 5),
                Arguments.of(new ListNode(0), 0),
                Arguments.of(generateListNode2(), 11)
        );
    }


    private static ListNode generateListNode1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        return head;
    }

    private static ListNode generateListNode2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        return head;
    }
}