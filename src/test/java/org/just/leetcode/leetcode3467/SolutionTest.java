package org.just.leetcode.leetcode3467;

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
    void testSolution(int[] arg1, int[] expected) {
        int[] actual = solution.transformArray(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{0, 0, 1, 1}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{0, 0, 1, 1}),
                Arguments.of(generateArray(), generateResultArray())
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int[] generateResultArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            if (i < 50) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }
}