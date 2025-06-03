package org.just.leetcode.leetcode1672;

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
    void testSolution(int[][] arg1, int expected) {
        int actual = solution.maximumWealth(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {3, 2, 1}}, 6),
                Arguments.of(new int[][]{{1, 5}, {7, 3}, {3, 5}}, 10),
                Arguments.of(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}, 17)
        );
    }
}