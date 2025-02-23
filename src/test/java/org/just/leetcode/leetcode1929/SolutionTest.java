package org.just.leetcode.leetcode1929;

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
    void testSolution(int[] arg1, int[] expected) {
        int[] actual = solution.getConcatenation(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                Arguments.of(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1}),
                Arguments.of(generateArray(), generateResultArray())
        );
    }

    private static int[] generateArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int[] generateResultArray() {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (i >= 1000) {
                array[i] = i - 1000;
            }
        }
        return array;
    }
}