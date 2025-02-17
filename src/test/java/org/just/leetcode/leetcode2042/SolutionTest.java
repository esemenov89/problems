package org.just.leetcode.leetcode2042;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void kthDistinct(String s, boolean expected) {
        boolean actual = solution.areNumbersAscending(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1 box has 3 blue 4 red 6 green and 12 yellow marbles", true),
                Arguments.of("hello world 5 x 5", true),
                Arguments.of("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s", true),
                Arguments.of(new String[]{"d", "b", "b", "b", "c", "c", "a"}, 2, "a"),
                Arguments.of(new String[]{"d", "b", "b", "b", "c", "c", "a"}, 10, ""),
                Arguments.of(generateStrings(), 1, "aa"),
                Arguments.of(new String[]{"a"}, 3, ""),
                Arguments.of(new String[]{"a"}, 1, "a")
        );
    }

    private static String[] generateStrings() {
        String[] arr = new String[1000];
        for (int i = 0; i < 1000; i++) {
            if (i == 800) {
                arr[i] = "aa";
            } else {
                arr[i] = "u";
            }
        }
        return arr;
    }
}