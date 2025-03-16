package org.just.leetcode.leetcode1684;

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
    @MethodSource("provideArguments")
    void testSolution(String arg1, String[] arg2, int expected) {
        int actual = solution.countConsistentStrings(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}, 2),
                Arguments.of("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}, 7),
                Arguments.of("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}, 4),
                Arguments.of("abc", generateStrings(), 10000)
        );
    }

    private static String[] generateStrings() {
        String[] result = new String[10000];
        Arrays.fill(result, "abcbcacbac");
        return result;
    }
}