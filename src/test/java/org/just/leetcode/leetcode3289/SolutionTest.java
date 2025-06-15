package org.just.leetcode.leetcode3289;

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
        int[] actual = solution.getSneakyNumbers(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 0}, new int[]{1, 0}),
                Arguments.of(new int[]{0, 3, 2, 1, 3, 2}, new int[]{3, 2}),
                Arguments.of(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}, new int[]{4, 5})
        );
    }
}