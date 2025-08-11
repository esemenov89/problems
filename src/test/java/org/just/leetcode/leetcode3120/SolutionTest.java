package org.just.leetcode.leetcode3120;

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
        int actual = solution.numberOfSpecialChars(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("aaAbcBC", 3),
                Arguments.of("abc", 0),
                Arguments.of("abBCab", 1),
                Arguments.of("aA".repeat(25), 1),
                Arguments.of("aaAbcBC", 3)
        );
    }
}