package org.just.leetcode.leetcode3264;

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
    void testSolution(int[] arg1, int arg2, int arg3, int[] expected) {
        int[] actual = solution.getFinalState(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 5, 6}, 5, 2, new int[]{8, 4, 6, 5, 6}),
                Arguments.of(new int[]{1, 2}, 3, 4, new int[]{16, 8}),
                Arguments.of(new int[]{2, 1, 3, 5, 6}, 5, 2, new int[]{8, 4, 6, 5, 6})
        );
    }
}