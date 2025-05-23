package org.just.leetcode.leetcode3392;

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
        int actual = solution.countSubarrays(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1, 4, 1}, 1),
                Arguments.of(new int[]{1, 2, -1, -4, -1}, 1),
                Arguments.of(new int[]{1, 1, 1}, 0),
                Arguments.of(new int[]{1, 2, 1, 4, 1}, 1),
                Arguments.of(new int[]{-1, -4, -1, 4}, 1),
                Arguments.of(generateArray(), 10)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
            }
            if (i % 3 == 0 && i != 0 || i == 1 || i % 5 == 0) {
                array[i] = 4;
            }
        }
        return array;
    }
}