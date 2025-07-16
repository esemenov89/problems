package org.just.leetcode.leetcode3201;

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
    void testSolution(int[] arg1, int expected) {
        int actual = solution.maximumLength(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 4, 2, 4}, 4),
                Arguments.of(new int[]{1, 5, 9, 4, 2}, 3),
                Arguments.of(new int[]{1, 2, 3, 4}, 4),
                Arguments.of(new int[]{1, 2, 1, 1, 2, 1, 2}, 6),
                Arguments.of(new int[]{1, 3}, 2),
                Arguments.of(generateArray(), 20000),
                Arguments.of(generateArray2(), 20000)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[20000];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = 2;
            }
        }
        return array;
    }

    private static int[] generateArray2() {
        int[] array = new int[20000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}