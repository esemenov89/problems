package org.just.leetcode.leetcode884;

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
    void testSolution(String arg1, String arg2, String[] expected) {
        String[] actual = solution.uncommonFromSentences(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("this apple is sweet", "this apple is sour", new String[]{"sweet", "sour"}),
                Arguments.of("apple apple", "banana", new String[]{"banana"}),
                Arguments.of("ABCD".repeat(25), 0)
        );
    }
}