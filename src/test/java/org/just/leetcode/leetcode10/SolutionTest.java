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
/*                Arguments.of("aa", "a", false),
                Arguments.of("aa", "a*", true),
                Arguments.of("ab", ".*", true),*/
                Arguments.of("aaabbb", "a.*b.*", true),
                Arguments.of("aaabbb", "a*b...", false),
                Arguments.of("aaabbb", "a..*b..*", true),
                Arguments.of("abcabcdef", 6),
                Arguments.of(" ", 1),
                Arguments.of(generateString(), 2)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("u");
            }
        }
        return stringBuilder.toString();
    }
}