package org.just.leetcode.leetcode1534;

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
    void testSolution(int[] arg1, int arg2, int arg3, int arg4, int expected) {
        int actual = solution.countGoodTriplets(arg1, arg2, arg3, arg4);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3, 4),
                Arguments.of(new int[]{1, 1, 2, 2, 3}, 0, 0, 1, 0),
                Arguments.of(generateArray(), 100, 100, 100, 161700)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        return array;
    }
}