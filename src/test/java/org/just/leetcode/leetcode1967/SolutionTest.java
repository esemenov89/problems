package org.just.leetcode.leetcode1967;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void numOfStrings(String[] patterns, String s, int expected) {
        int actual = solution.numOfStrings(patterns, s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of(new String[]{"a","abc","bc","d"}, "abc", 1),
                Arguments.of(new String[]{"a","b","c"}, "aaaaabbbbb", 1),
                Arguments.of(new String[]{"a","a","a"}, "ab", 1),
                Arguments.of(generatePatterns(), generateString(), 1)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("u");
            }
        }
        return stringBuilder.toString();
    }

    private static String[] generatePatterns() {
        String[] words = new String[100];
        Arrays.fill(words, "au".repeat(50));
        return words;
    }
}