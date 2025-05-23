package org.just.leetcode.leetcode2185;

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
    void testSolution(String[] arg1, String arg2, int expected) {
        int actual = solution.prefixCount(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"pay", "attention", "practice", "attend"}, "at", 2),
                Arguments.of(new String[]{"leetcode", "win", "loops", "success"}, "code", 0),
                Arguments.of(new String[]{"a ".repeat(100), "b ".repeat(99)}, "a", 1),
                Arguments.of(new String[]{"a ".repeat(100) + "abc", "b ".repeat(99)}, "abc", 0)
        );
    }
}