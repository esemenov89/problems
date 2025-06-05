package org.just.leetcode.leetcode1365;

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
        int[] actual = solution.smallerNumbersThanCurrent(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{8, 1, 2, 2, 3}, new int[]{4, 0, 1, 1, 3}),
                Arguments.of(new int[]{6, 5, 4, 8}, new int[]{2, 1, 0, 3}),
                Arguments.of(new int[]{7, 7, 7, 7}, new int[]{0, 0, 0, 0}),
                Arguments.of(new int[]{1000, 4, 8, 3}, new int[]{3, 1, 2, 0})
        );
    }
}