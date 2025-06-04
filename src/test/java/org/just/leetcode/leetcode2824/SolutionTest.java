package org.just.leetcode.leetcode2824;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(List<Integer> arg1, int arg2, int expected) {
        int actual = solution.countPairs(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of(-1, 1, 2, 3, 1), 2, 3),
                Arguments.of(List.of(-6, 2, 5, -2, -7, -1, 3), -2, 10),
                Arguments.of(List.of(-6, 2, 5, -2, -7, -1, 3), -2, 10)
                );
    }
}