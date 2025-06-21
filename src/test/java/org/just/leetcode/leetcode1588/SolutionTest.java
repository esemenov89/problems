package org.just.leetcode.leetcode1588;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(int[] arg1, int expected) {
        int actual = solution.sumOddLengthSubarrays(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 2, 5, 3}, 58),
                Arguments.of(new int[]{1, 2}, 3),
                Arguments.of(new int[]{10, 11, 12}, 66),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1, 1}, 44),
                // 7 + 7 + 3 + 3 + 3 + 3 + 3 + 5 + 5 + 5
                Arguments.of(generateArray(), 85850000)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        Arrays.fill(array, 1000);
        return array;
    }

    private static int[] generateArray2() {
        int[] array = new int[50];
        Arrays.fill(array, 1);
        return array;
    }
}