package org.just.leetcode.leetcode2864;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.maximumOddBinaryNumber(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("101", "101"),
                Arguments.of("010", "001"),
                Arguments.of("0101", "1001"),
                Arguments.of("010", "001"),
                Arguments.of("1".repeat(100), "1".repeat(100)),
                Arguments.of("1".repeat(99) + "0", "1".repeat(98) + "01")
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100000];
        Arrays.fill(array, 1_000_000);
        array[0] = 1_000_000;
        array[1] = 1;
        return array;
    }
}