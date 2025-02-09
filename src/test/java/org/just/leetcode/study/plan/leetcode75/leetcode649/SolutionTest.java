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
    void predictPartyVictory(String s, String expected) {
        String actual = solution.predictPartyVictory(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("RD", "Radiant"),
                Arguments.of("RDD", "Dire"),
                Arguments.of("DDRRRR", "Radiant"),
                Arguments.of(generateString(), "Radiant")
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("R");
            } else {
                stringBuilder.append("D");
            }
        }
        return stringBuilder.toString();
    }
}