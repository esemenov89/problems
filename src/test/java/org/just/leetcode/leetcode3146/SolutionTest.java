package org.just.leetcode.leetcode3146;

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
    void testSolution(String arg1, String arg2, int expected) {
        int actual = solution.findPermutationDifference(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("abc", "bac", 2),
                Arguments.of("abcde", "edbac", 12),
                Arguments.of("abcdefghijklmnopqrstuvwxyz", "bcdefghijklmnopqrstuvwxyza", 50)
        );
    }
}