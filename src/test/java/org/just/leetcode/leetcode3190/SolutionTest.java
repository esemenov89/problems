package org.just.leetcode.leetcode3190;

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
        int actual = solution.minimumOperations(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 3),
                Arguments.of(new int[]{3, 6, 9}, 0),
                Arguments.of(generateArray(), 33)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}