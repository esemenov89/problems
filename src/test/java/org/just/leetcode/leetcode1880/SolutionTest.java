package org.just.leetcode.leetcode1880;

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
    void testSolution(String arg1, String arg2, String arg3, boolean expected) {
        boolean actual = solution.isSumEqual(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("acb", "cba", "cdb", true),
                Arguments.of("aaa", "a", "aab", false),
                Arguments.of("aaa", "a", "aaaa", true),
                Arguments.of("aa", "jjjjjjjj", "jjjjjjjj", true)
        );
    }
}