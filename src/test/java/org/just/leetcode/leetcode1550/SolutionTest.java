package org.just.leetcode.leetcode1550;

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
    void testSolution(int[] arg1, boolean expected) {
        boolean actual = solution.threeConsecutiveOdds(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 6, 4, 1}, false),
                Arguments.of(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}, true),
                Arguments.of(new int[]{2, 1, 3, 5}, true),
                Arguments.of(new int[]{1, 1, 1}, true),
                Arguments.of(new int[]{1}, false),
                Arguments.of(generateArray(), false),
                Arguments.of(generateArray2(), true)
        );
    }

    private static int[] generateArray() {
        int[] result = new int[1000];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    private static int[] generateArray2() {
        int[] result = new int[1000];
        for (int i = 0; i < result.length; i++) {
            if (i == 997) {
                result[i] = 1;
            } else if (i == 998) {
                result[i] = 3;
            } else if (i == 999) {
                result[i] = 5;
            } else {
                result[i] = i;
            }
        }
        return result;
    }
}