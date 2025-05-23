package org.just.leetcode.leetcode2108;

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
    void testSolution(String[] arg1, String expected) {
        String actual = solution.firstPalindrome(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"abc", "car", "ada", "racecar", "cool"}, "ada"),
                Arguments.of(new String[]{"notapalindrome", "racecar"}, "racecar"),
                Arguments.of(new String[]{"def", "ghi"}, ""),
                Arguments.of(new String[]{"abba", "ghi"}, "abba"),
                Arguments.of(new String[]{"a", "ghi"}, "a"),
                Arguments.of(new String[]{"aa", "ghi"}, "aa")
        );
    }
}