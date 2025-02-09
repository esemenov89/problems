package org.just.leetcode.study.plan.leetcode75.leetcode649;

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
    void minTimeToType(String s, String expected) {
        String actual = solution.predictPartyVictory(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("abc", ""),
                Arguments.of("bza", ""),
                Arguments.of("zjpc", ""),
                Arguments.of(generateString(), "")
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("u");
            }
        }
        return stringBuilder.toString();
    }
}