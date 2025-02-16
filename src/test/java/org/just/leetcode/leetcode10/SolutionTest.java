package org.just.leetcode.leetcode10;

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
    void isMatch(String s, String p, boolean expected) {
        boolean actual = solution.isMatch(s, p);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("aaa", "ab*a*c*a", true),
                Arguments.of("mississippi", "mis*is*ip*.", true),
                Arguments.of("mississippi", "mis*is*p*.", false),
                Arguments.of("aab", "c*a*b*", true),
                Arguments.of("aab", "c*d*e*a*b*", true),
                Arguments.of("aab", "c*.*e*a*b*", true),
                Arguments.of("aaabbb", "a*.b*.", true),
                Arguments.of("aa", "a", false),
                Arguments.of("aa", "a*", true),
                Arguments.of("ab", ".*", true),
                Arguments.of("aaabbb", "a.*b.*", true),
                Arguments.of("aaabbbccc", "a*b*c*", true),
                Arguments.of("aaabbb", "a*b...", false),
                Arguments.of("aaabbb", "a*..b..", true),
                Arguments.of("aaabbb", "a*b*..", true),
                Arguments.of("aaabbb", "a*b*...", false),
                Arguments.of("aaabbb", "a..*b..*", true),
                Arguments.of("ef", "ef", true),
                Arguments.of("abcabcdef", "abcabcdef", true),
                Arguments.of("a", "a", true),
                Arguments.of("a", "b", false),
                Arguments.of("a", ".", true),
                Arguments.of(generateString(), "a*", false),
                Arguments.of(generateString2(), "a*", true),
                Arguments.of(generateString2(), generatePattern(), true),
                Arguments.of(generateString2(), generatePattern2(), true),
                Arguments.of(generateString2(), generatePattern3(), false)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("u");
            }
        }
        return stringBuilder.toString();
    }

    private static String generateString2() {
        return "a".repeat(20);
    }

    private static String generatePattern() {
        return ".".repeat(20);
    }

    private static String generatePattern2() {
        String s = ".".repeat(20) + '*';
        return s;
    }

    private static String generatePattern3() {
        String s = ".".repeat(20) + '*' + 'b';
        return s;
    }
}