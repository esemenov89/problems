package org.just.leetcode.leetcode1945;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStringsAndNumbers")
    void getLucky(String s, int k, int expected) {
        int actual = solution.getLucky(s, k);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStringsAndNumbers() {
        return Stream.of(
                Arguments.of("iiii", 1, 36),
                Arguments.of("leetcode", 2, 6),
                Arguments.of("zbax", 2, 8),
                Arguments.of("z".repeat(100), 10, 8),
                Arguments.of("hvmhoasabaymnmsd", 1, 79)
        );
    }
}