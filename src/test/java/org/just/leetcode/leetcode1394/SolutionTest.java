package org.just.leetcode.leetcode1394;

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
    void testSolution(int[] arg1, int expected) {
        int actual = solution.findLucky(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, 4}, 2),
                Arguments.of(new int[]{1, 2, 2, 3, 3, 3}, 3),
                Arguments.of(new int[]{2, 2, 2, 3, 3}, -1),
                Arguments.of(new int[]{2, 2, 3, 4}, 2),
                Arguments.of(generateArray(), 250)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[500];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 250;
            } else {
                array[i] = 10;
            }
        }
        return array;
    }
}