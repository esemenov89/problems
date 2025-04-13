package org.just.leetcode.leetcode1309;

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
    void testSolution(String arg1, int expected) {
        String actual = solution.freqAlphabets(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("10#11#12", "jkab"),
                Arguments.of("1326#", "acz"),
                Arguments.of(new int[]{1, 2, 3}, 0),
                Arguments.of(new int[]{1, 2, 3, 1, 1, 3}, 4),
                Arguments.of(generateArray(), 4950)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        Arrays.fill(array, 1);
        return array;
    }
}