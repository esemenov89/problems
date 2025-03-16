package org.just.leetcode.leetcode2042;

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
    void areNumbersAscending(String s, boolean expected) {
        boolean actual = solution.areNumbersAscending(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1 box has 3 blue 4 red 6 green and 12 yellow marbles", true),
                Arguments.of("hello world 5 x 5", false),
                Arguments.of("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s", false),
                Arguments.of("sunset is at 7 51 52 pm overnight lows will be in the low 53 and 60 s", true),
                Arguments.of("12 10", false),
                Arguments.of(generateString(), true)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            stringBuilder.append(i + 1).append(" ");
        }
        return stringBuilder.toString();
    }
}