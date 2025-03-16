package org.just.leetcode.leetcode2011;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void reversePrefix(String[] operations, int expected) {
        int actual = solution.finalValueAfterOperations(operations);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of(new String[]{"--X", "X++", "X++"}, 1),
                Arguments.of(new String[]{"++X", "++X", "X++"}, 3),
                Arguments.of(new String[]{"X++", "++X", "--X", "X--"}, 0),
                Arguments.of(new String[]{"X++"}, 1),
                Arguments.of(generateIncrementStrings(), 100),
                Arguments.of(generateDecrementStrings(), -100),
                Arguments.of(generateStrings(), 0)
        );
    }

    private static String[] generateStrings() {
        String[] strings = new String[100];
        for (int i = 0; i < strings.length; i++) {
            switch (i % 4) {
                case 0:
                    strings[i] = "X++";
                    break;
                case 1:
                    strings[i] = "--X";
                    break;
                case 2:
                    strings[i] = "++X";
                    break;
                case 3:
                    strings[i] = "--X";
                    break;
            }
        }
        return strings;
    }

    private static String[] generateIncrementStrings() {
        String[] strings = new String[100];
        Arrays.fill(strings, "X++");
        return strings;
    }

    private static String[] generateDecrementStrings() {
        String[] strings = new String[100];
        Arrays.fill(strings, "X--");
        return strings;
    }
}