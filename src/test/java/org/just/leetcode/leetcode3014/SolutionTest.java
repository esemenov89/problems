package org.just.leetcode.leetcode3014;

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
    void testSolution(String arg1, int expected) {
        int actual = solution.minimumPushes(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("abcde", 5),
                Arguments.of("xycdefghij", 12),
                Arguments.of("abcdefgh", 8),
                Arguments.of("abcdefghijklmnopqrstuvwxyz", 56),
                Arguments.of("abcdefgh".repeat(3), 24)
        );
    }
}