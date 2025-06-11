package org.just.leetcode.leetcode2956;

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
    void testSolution(int[] arg1, int[] arg2, int[] expected) {
        int[] actual = solution.findIntersectionValues(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 2}, new int[]{1, 2}, new int[]{2, 1}),
                Arguments.of(new int[]{4, 3, 2, 3, 1}, new int[]{2, 2, 5, 2, 3, 6}, new int[]{3, 4}),
                Arguments.of(new int[]{3, 4, 2, 3}, new int[]{1, 5}, new int[]{0, 0})
        );
    }
}