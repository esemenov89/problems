package org.just.leetcode.leetcode2294;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(int[] arg1, int arg2, int expected) {
        int actual = solution.partitionArray(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 6, 1, 2, 5}, 2, 2),
                Arguments.of(new int[]{1, 2, 3}, 1, 2),
                Arguments.of(new int[]{2, 2, 4, 5}, 0, 3),
                Arguments.of(generateArray(), 1, 50000),
                Arguments.of(generateArray(), 0, 100000),
                Arguments.of(generateArray2(), 8327, 1)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int[] generateArray2() {
        int[] array = new int[100000];
        return array;
    }
}