package org.just.leetcode.study.plan.leetcode75.leetcode841;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(List<List<Integer>> arg1, boolean expected) {
        boolean actual = solution.canVisitAllRooms(arg1);

        assertThat(actual, equalTo(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of(List.of(1), List.of(2), List.of(3)), true),
                Arguments.of(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0)), false)
        );
    }
}