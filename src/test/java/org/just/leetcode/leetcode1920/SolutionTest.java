package org.just.leetcode.leetcode1920;

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
    void testSolution(int[] arg1, int[] expected) {
        int[] actual = solution.buildArray(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 1, 5, 3, 4}, new int[]{0, 1, 2, 4, 5, 3}),
                Arguments.of(new int[]{5, 0, 1, 2, 3, 4}, new int[]{4, 5, 0, 1, 2, 3}),
                Arguments.of(generateArray(), generateArray()),
                Arguments.of(new int[]{5, 0, 1, 2, 3, 4}, new int[]{4, 5, 0, 1, 2, 3})
        );
    }

    private static int[] generateArray() {
        int[] result = new int[1000];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }
}