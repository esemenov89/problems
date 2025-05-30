package org.just.leetcode.leetcode2124;

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
    void testSolution(String arg1, boolean expected) {
        boolean actual = solution.checkString(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("aaabbb", true),
                Arguments.of("abab", false),
                Arguments.of("bbb", true),
                Arguments.of("a".repeat(50) + "b".repeat(50), true),
                Arguments.of("a".repeat(50) + "b".repeat(50) + "a", false)
        );
    }
}