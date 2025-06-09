package org.just.leetcode.leetcode2367;

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
    void testSolution(int[] arg1, int arg2, int expected) {
        int actual = solution.arithmeticTriplets(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 4, 6, 7, 10}, 3, 2),
                Arguments.of(new int[]{4, 5, 6, 7, 8, 9}, 2, 2),
                Arguments.of(generateArray(), 10, 5)
        );
    }

    private static int[] generateArray() {
        int[] result = new int[100];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 100);
        }

        return result;
    }
}