package org.just.leetcode.leetcode3477;

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
    void testSolution(int[] arg1, int[] arg2, int expected) {
        int actual = solution.numOfUnplacedFruits(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 5}, new int[]{3, 5, 4}, 1),
                Arguments.of(new int[]{3, 6, 1}, new int[]{6, 4, 7}, 0),
                Arguments.of(generateArray(), generateArray(), 0),
                Arguments.of(generateArray(), generateArray2(), 998)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[1000];
        Arrays.fill(array, 1);
        return array;
    }

    private static int[] generateArray2() {
        int[] array = new int[1000];
        Arrays.fill(array, 0);
        array[998] = 1;
        array[999] = 1;
        return array;
    }
}