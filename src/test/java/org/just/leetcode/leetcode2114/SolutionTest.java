package org.just.leetcode.leetcode2114;

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
    void testSolution(String[] arg1, int expected) {
        int actual = solution.mostWordsFound(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}, 6),
                Arguments.of(new String[]{"please wait", "continue to fight", "continue to win"}, 3),
                Arguments.of(new String[]{"a ".repeat(100), "b ".repeat(99)}, 100)
        );
    }
}