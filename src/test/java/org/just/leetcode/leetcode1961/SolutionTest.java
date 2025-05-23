package org.just.leetcode.leetcode1961;

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
    void minTimeToType(String s, String[] words, boolean expected) {
        boolean actual = solution.isPrefixString(s, words);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}, true),
                Arguments.of("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}, false),
                Arguments.of("zjpc", new String[]{"i", "love", "leetcode", "apples"}, false),
                Arguments.of(generateString(), generateWords(), true)
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

    private static String[] generateWords() {
        String[] words = new String[100];
        Arrays.fill(words, "au".repeat(10));
        return words;
    }
}