package org.just.leetcode.leetcode5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void longestPalindrome(String s, String expected) {
        String actual = solution.longestPalindrome(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        String generatedResult = generateString();
        generatedResult = generatedResult.substring(0, generatedResult.length() - 1);
        return Stream.of(
                Arguments.of("1221", "1221"),
                Arguments.of("raat", "aa"),
                Arguments.of("rabat", "aba"),
                Arguments.of("aba", "aba"),
                Arguments.of("aa", "aa"),
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd","bb"),
                Arguments.of("pwwkew", "ww"),
                Arguments.of("abcabcdef", "a"),
                Arguments.of(" ", " "),
                Arguments.of(generateString(), generatedResult)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("u");
            }
        }
        return stringBuilder.toString();
    }
}