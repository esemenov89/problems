package org.just.leetcode.leetcode3110;

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
    void scoreOfString(String s, int expected) {
        int actual = solution.scoreOfString(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("hello", 13),
                Arguments.of("zaz", 50),
                Arguments.of("zz", 0),
                Arguments.of("abc".repeat(33), 130)
        );
    }
}