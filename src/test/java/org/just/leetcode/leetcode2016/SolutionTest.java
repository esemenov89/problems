package org.just.leetcode.leetcode2016;

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
    void testSolution(int[] arg1, int expected) {
        int actual = solution.maximumDifference(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 0}, 4),
                Arguments.of(new int[]{9, 4, 3, 2}, -1),
                Arguments.of(new int[]{1, 5, 2, 10}, 9)
        );
    }
}