package org.just.leetcode.leetcode1108;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void defangIPaddr(String s, String expected) {
        String actual = solution.defangIPaddr(s);

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