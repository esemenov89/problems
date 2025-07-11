package org.just.leetcode.leetcode2138;

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
    void testSolution(String arg1, int arg2, char arg3, String[] expected) {
        String[] actual = solution.divideString(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("abcdefghi", 3, 'x', new String[]{"abc", "def", "ghi"}),
                Arguments.of("abcdefghij", 3, 'x', new String[]{"abc", "def", "ghi", "jxx"}),
                Arguments.of("abcdefghij".repeat(11), 3, 'x', new String[]{"abc", "def", "ghi", "jab", "cde", "fgh", "ija", "bcd", "efg", "hij", "abc", "def", "ghi", "jab", "cde", "fgh", "ija", "bcd", "efg", "hij", "abc", "def", "ghi", "jab", "cde", "fgh", "ija", "bcd", "efg", "hij", "abc", "def", "ghi", "jab", "cde", "fgh", "ijx"})
        );
    }
}