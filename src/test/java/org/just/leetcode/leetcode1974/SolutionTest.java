package org.just.leetcode.leetcode1974;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void minTimeToType(String s, int expected) {
        int actual = solution.minTimeToType(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("abc", 5),
                Arguments.of("bza", 7),
                Arguments.of("zjpc", 34),
                Arguments.of(generateString(), 701)
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