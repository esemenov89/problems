package org.just.leetcode.leetcode2496;

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
    void testSolution(String[] arg1, int expected) {
        int actual = solution.maximumValue(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"alic3", "bob", "3", "4", "00000"}, 5),
                Arguments.of(new String[]{"1", "01", "001", "0001"}, 1),
                Arguments.of(generateStrings(), 999_999_999)
        );
    }

    private static String[] generateStrings() {
        String[] arr = new String[1000];
        Arrays.fill(arr, "a".repeat(9));
        arr[0] = "999999999";
        return arr;
    }
}