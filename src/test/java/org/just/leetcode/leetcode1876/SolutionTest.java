package org.just.leetcode.leetcode1876;

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
        int actual = solution.countGoodSubstrings(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("this apple is sweet", "this apple is sour", new String[]{"sweet", "sour"}),
                Arguments.of("apple apple", "banana", new String[]{"banana"}),
                Arguments.of("apple apple ".repeat(100), "banana", new String[]{"banana"})
        );
    }
}