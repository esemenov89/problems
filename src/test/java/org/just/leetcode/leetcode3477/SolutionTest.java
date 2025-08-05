package org.just.leetcode.leetcode3477;

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
    void testSolution(int[] arg1, int[] arg2, int expected) {
        int actual = solution.numOfUnplacedFruits(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 5}, new int[]{3, 5, 4}, 1),
                Arguments.of(new int[]{4, 2, 5}, new int[]{3, 5, 4}, 1),
                Arguments.of(new int[]{4, 2, 5}, new int[]{3, 5, 4}, 1)
        );
    }
}