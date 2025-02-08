package org.just.leetcode.leetcode1941;

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
    void areOccurrencesEqual(String s, boolean expected) {
        boolean actual = solution.areOccurrencesEqual(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("abacbc", true),
                Arguments.of("aaabb", false),
                Arguments.of(generateString(), true)
        );
    }

    private static String generateString() {
        char[] chars = new char[1000];
        for (int i = 0; i < chars.length; i++) {
            switch (i % 10) {
                case 0:
                    chars[i] = 'a';
                    break;
                case 1:
                    chars[i] = 'b';
                    break;
                case 2:
                    chars[i] = 'c';
                    break;
                case 3:
                    chars[i] = 'd';
                    break;
                case 4:
                    chars[i] = 'e';
                    break;
                case 5:
                    chars[i] = 'f';
                    break;
                case 6:
                    chars[i] = 'g';
                    break;
                case 7:
                    chars[i] = 'h';
                    break;
                case 8:
                    chars[i] = 'i';
                    break;
                case 9:
                    chars[i] = 'j';
                    break;
            }
        }
        return new String(chars);
    }
}