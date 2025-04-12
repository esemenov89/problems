package org.just.leetcode.leetcode1512;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(int[] arg1, int expected) {
        int actual = solution.numIdenticalPairs(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1, 1, 3}, 4),
                Arguments.of(new int[]{1, 1, 1, 1}, 6),
                Arguments.of(new int[]{1, 2, 3}, 0),
                Arguments.of(new int[]{1, 2, 3, 1, 1, 3}, 4),
                Arguments.of(generateArray(), 4950)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        Arrays.fill(array, 1);
        return array;
    }
}