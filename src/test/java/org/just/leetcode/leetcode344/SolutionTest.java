package org.just.leetcode.leetcode344;

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
    void testSolution(char[] arg1, char[] expected) {
        solution.reverseString(arg1);

        assertThat(arg1, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}),
                Arguments.of(new char[]{'h', 'e', 'l', 'l'}, new char[]{'l', 'l', 'e', 'h'}),
                Arguments.of(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}, new char[]{'h', 'a', 'n', 'n', 'a', 'H'}),
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