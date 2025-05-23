package org.just.leetcode.leetcode1769;

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
    void testSolution(String arg1, int[] expected) {
        int[] actual = solution.minOperations(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("110", new int[]{1, 1, 3}),
                Arguments.of("001011", new int[]{11, 8, 5, 4, 3, 4}),
                Arguments.of("111", new int[]{3, 2, 3}),
                Arguments.of("1".repeat(2000), generateResultArray())
        );
    }

    private static int[] generateResultArray() {
        int[] array = new int[2000];
        Arrays.fill(array, 1999);
        return array;
    }
}