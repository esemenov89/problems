package org.just.leetcode.leetcode2533;

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
        int[] actual = solution.separateDigits(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{13, 25, 83, 77}, new int[]{1, 3, 2, 5, 8, 3, 7, 7}),
                Arguments.of(new int[]{7, 1, 3, 9}, new int[]{7, 1, 3, 9}),
                Arguments.of(new int[]{13, 25, 83, 77}, new int[]{1, 3, 2, 5, 8, 3, 7, 7})
        );
    }
}