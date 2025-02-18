package org.just.leetcode.leetcode125;

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
    void isPalindrome(String s, boolean expected) {
        boolean actual = solution.isPalindrome(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("OP", false),
                Arguments.of("0P", false),
                Arguments.of("a.b,.", false),
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("aaaa", true),
                Arguments.of("anca", false),
                Arguments.of("aabaa", true),
                Arguments.of("anbca", false),
                Arguments.of("race a car", false),
                Arguments.of(" ", true),
                Arguments.of("a".repeat(200000), true),
                Arguments.of("ab".repeat(100000), false),
                Arguments.of("!".repeat(200000), true),
                Arguments.of(generateString(), true)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 200000; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append(":");
            }
        }
        return stringBuilder.toString();
    }
}