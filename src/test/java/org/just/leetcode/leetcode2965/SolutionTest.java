package org.just.leetcode.leetcode2965;

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
    void testSolution(int[][] arg1, int[] expected) {
        int[] actual = solution.findMissingAndRepeatedValues(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 2}}, new int[]{2, 4}),
                Arguments.of(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}, new int[]{9, 5}),
                Arguments.of(new int[][]{{2, 3}, {1, 1}}, new int[]{1, 4}),
                Arguments.of(new int[][]{{1, 2}, {4, 4}}, new int[]{4, 3})
        );
    }
}