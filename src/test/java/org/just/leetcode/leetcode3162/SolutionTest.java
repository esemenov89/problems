package org.just.leetcode.leetcode3162;

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
    void testSolution(int[] arg1, int[] arg2, int arg3, int expected) {
        int actual = solution.numberOfPairs(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1, 5),
                Arguments.of(new int[]{1, 2, 4, 12}, new int[]{2, 4}, 3, 2),
                Arguments.of(generateArray(), generateArray2(), 1, 2500)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int[] generateArray2() {
        int[] array = new int[50];
        Arrays.fill(array, 1);
        return array;
    }
}