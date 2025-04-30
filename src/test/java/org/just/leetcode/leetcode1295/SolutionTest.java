package org.just.leetcode.leetcode1295;

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
    void testSolution(int[] arg1, int expected) {
        int actual = solution.findNumbers(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{12, 345, 2, 6, 7896}, 2),
                Arguments.of(new int[]{12, 345, 2, 6, 7896}, 2),
                Arguments.of(generateArray(), 1)
        );
    }

    private static String[] generateArray() {
        String[] words = new String[100];
        Arrays.fill(words, "a".repeat(100));
        return words;
    }
}