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
                Arguments.of(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4, 3)
        );
    }

    private static int[] generateArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    private static String[] generateStrings() {
        String[] arr = new String[100];
        Arrays.fill(arr, "a");
        return arr;
    }
}