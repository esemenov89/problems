package org.just.leetcode.leetcode2574;

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
        int[] actual = solution.leftRightDifference(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{10, 4, 8, 3}, new int[]{15, 1, 11, 22}),
                Arguments.of(new int[]{1}, new int[]{0}),
                Arguments.of(new int[]{1, 2}, new int[]{2, 1}),
                Arguments.of(new int[]{1000, 4, 8, 3}, new int[]{15, 989, 1001, 1012})
        );
    }
}