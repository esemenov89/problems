package org.just.leetcode.leetcode594;

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
        int actual = solution.findLHS(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 2, 5, 2, 3, 7}, 5),
                Arguments.of(new int[]{1, 2, 3, 4}, 2),
                Arguments.of(new int[]{1, 1, 1, 1}, 5),
                Arguments.of(new int[]{1, 3, 2, 2, 5, 2, 3, 7}, 5),
                Arguments.of(new int[]{1, 3, 2, 2, 5, 2, 3, 7}, 5)
        );
    }
}