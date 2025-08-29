package org.just.leetcode.leetcode2068;

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
    void testSolution(String arg1, String arg2, Boolean expected) {
        boolean actual = solution.checkAlmostEquivalent(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("aaaa", "bccb", false),
                Arguments.of("abcdeef", "abaaacc", true),
                Arguments.of("cccddabba", "babababab", true),
                Arguments.of("abcdeef", "abaaacc", true)
        );
    }
}