package org.just.leetcode.leetcode3461;

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
    void testSolution(String arg1, boolean expected) {
        boolean actual = solution.hasSameDigits(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("3902", true),
                Arguments.of("34789", false),
                Arguments.of("34789", false),
                Arguments.of(generateChars(), generateChars())
        );
    }

    private static char[] generateChars() {
        char[] chars = new char[100001];
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = 'a';
            } else {
                chars[i] = 'b';
            }
        }
        return chars;
    }
}