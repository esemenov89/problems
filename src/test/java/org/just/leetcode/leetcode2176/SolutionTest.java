package org.just.leetcode.leetcode2176;

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
    void testSolution(int[] arg1, int arg2, int expected) {
        int actual = solution.countPairs(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 2, 2, 1, 3}, 2, 4),
                Arguments.of(new int[]{1, 2, 3, 4}, 1, 0),
                Arguments.of(generateArray(), 1, 4950)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        Arrays.fill(array, 100);
        return array;
    }
}