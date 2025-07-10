package org.just.leetcode.leetcode1544;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.makeGood(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("leEeetcode", "leetcode"),
                Arguments.of("abBAcC", ""),
                Arguments.of("s", "s"),
                Arguments.of("aa", "aa"),
                Arguments.of("aA", ""),
                Arguments.of("Pp", ""),
                Arguments.of("aA".repeat(50), "")
        );
    }
}