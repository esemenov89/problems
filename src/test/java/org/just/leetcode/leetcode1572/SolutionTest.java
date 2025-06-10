package org.just.leetcode.leetcode1572;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(int[][] arg1, int expected) {
        int actual = solution.diagonalSum(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 25),
                Arguments.of(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}, 8),
                Arguments.of(new int[][]{{5}}, 5),
                Arguments.of(generateMatrix(), 9202)
        );
    }

    private static int[][] generateMatrix() {
        int[][] result = new int[100][100];
        for (int[] ints : result) {
            Arrays.fill(ints, 100);
        }

        return result;
    }
}