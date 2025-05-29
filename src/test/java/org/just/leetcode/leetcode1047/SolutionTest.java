package org.just.leetcode.leetcode1047;

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
        String actual = solution.removeDuplicates(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("abbaca", "ca"),
                Arguments.of("azxxzy", "ay"),
                Arguments.of("aab", "aab"),
                Arguments.of("a".repeat(100000), "aa"),
                Arguments.of("aaab", "aab"),
                Arguments.of("b" + "a".repeat(100000) + "b", "baab")
        );
    }
}