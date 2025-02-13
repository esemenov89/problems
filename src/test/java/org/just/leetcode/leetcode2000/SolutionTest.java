package org.just.leetcode.leetcode2000;

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
    void reversePrefix(String s, char ch, String expected) {
        String actual = solution.reversePrefix(s, ch);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        StringBuilder generatedResult = new StringBuilder(generateString());
        generatedResult.deleteCharAt(generatedResult.length() - 1);
        generatedResult.reverse();
        generatedResult.insert(0, "z");
        return Stream.of(
                Arguments.of("abcdefd", 'd', "dcbaefd"),
                Arguments.of("xyxzxe", 'z', "zxyxxe"),
                Arguments.of("abcd", 'z', "abcd"),
                Arguments.of("a", 'a', "a"),
                Arguments.of(generateString(), 'z', generatedResult.toString())
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 250; i++) {
            if (i < 125) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("u");
            }
        }
        stringBuilder.append("z");
        return stringBuilder.toString();
    }
}