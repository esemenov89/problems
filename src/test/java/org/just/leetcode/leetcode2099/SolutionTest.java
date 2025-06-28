package org.just.leetcode.leetcode2099;

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
    void testSolution(int[] arg1, int arg2, int[] expected) {
        int[] actual = solution.maxSubsequence(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{50, -75}, 2, new int[]{50, -75}),
                Arguments.of(new int[]{2, 1, 3, 3}, 2, new int[]{3, 3}),
                Arguments.of(new int[]{-1, -2, 3, 4}, 3, new int[]{-1, 3, 4}),
                Arguments.of(new int[]{3, 4, 3, 3}, 2, new int[]{3, 4}),
                Arguments.of(generateArray(), 1000, new int[]{3, 4})
        );
    }

    private static int[] generateArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }
}