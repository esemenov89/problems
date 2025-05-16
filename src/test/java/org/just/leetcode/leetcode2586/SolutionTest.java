package org.just.leetcode.leetcode2586;

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
    void testSolution(String[] arg1, int arg2, int arg3, int expected) {
        int actual = solution.vowelStrings(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"are", "amy", "u"}, 0, 2, 2),
                Arguments.of(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4, 3),
                Arguments.of(new String[]{"a"}, 0, 0, 1),
                Arguments.of(generateStrings(), 0, 999, 1000)
        );
    }

    private static String[] generateStrings() {
        String[] arr = new String[1000];
        Arrays.fill(arr, "aa");
        return arr;
    }
}