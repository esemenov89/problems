package org.just.leetcode.leetcode2900;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String[] arg1, int[] arg2, List<String> expected) {
        List<String> actual = solution.getLongestSubsequence(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"e", "a", "b"}, new int[]{0, 0, 1}, List.of("e", "b")),
                Arguments.of(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}, List.of("a", "b", "c")),
                Arguments.of(generateStrings(), "aa", 1000)
        );
    }

    private static String[] generateStrings() {
        String[] arr = new String[1000];
        Arrays.fill(arr, "a");
        return arr;
    }
}