package org.just.leetcode.leetcode1470;

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
    void testSolution(int[] arg1, int n, int[] expected) {
        int[] actual = solution.shuffle(arg1, n);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2, 3, 5, 4, 1, 7}),
                Arguments.of(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4, new int[]{1, 4, 2, 3, 3, 2, 4, 1}),
                Arguments.of(new int[]{1, 1, 2, 2}, 2, new int[]{1, 2, 1, 2}),
                Arguments.of(generateArray(), 500, generateResultArray())
        );
    }

    private static int[] generateArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            if (i < 500) {
                array[i] = 1000;
            } else {
                array[i] = 999;
            }
        }
        return array;
    }

    private static int[] generateResultArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 1000;
            } else {
                array[i] = 999;
            }
        }
        return array;
    }
}