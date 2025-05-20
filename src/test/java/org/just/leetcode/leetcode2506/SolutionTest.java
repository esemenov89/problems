package org.just.leetcode.leetcode2506;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String[] arg1, int expected) {
        int actual = solution.similarPairs(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}, 2),
                Arguments.of(new String[]{"aabb", "ab", "ba"}, 3),
                Arguments.of(new String[]{"nba", "cba", "dba"}, 0),
                Arguments.of(generateStrings(), 4950)
        );
    }

    private static String[] generateStrings() {
        String[] strings = new String[100];
        Arrays.fill(strings, "a".repeat(100));
        return strings;
    }
}