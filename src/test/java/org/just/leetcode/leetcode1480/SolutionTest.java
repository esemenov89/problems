package org.just.leetcode.leetcode1480;

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
    void testSolution(int[] arg1, int[] expected) {
        int[] actual = solution.runningSum(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17}),
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10})
        );
    }
}