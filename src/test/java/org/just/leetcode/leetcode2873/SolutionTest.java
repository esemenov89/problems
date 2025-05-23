package org.just.leetcode.leetcode2873;

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
    void testSolution(int[] arg1, long expected) {
        long actual = solution.maximumTripletValue(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{12, 6, 1, 2, 7}, 77),
                Arguments.of(new int[]{1, 10, 3, 4, 19}, 133),
                Arguments.of(new int[]{1, 2, 3}, 0),
                Arguments.of(generateArray(), 999_999_000_000L)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        Arrays.fill(array, 1_000_000);
        array[0] = 1_000_000;
        array[1] = 1;
        return array;
    }
}