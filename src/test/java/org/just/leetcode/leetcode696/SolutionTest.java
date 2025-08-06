package org.just.leetcode.leetcode696;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String arg1, int expected) {
        int actual = solution.countBinarySubstrings(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1111100000", 5),
                Arguments.of("00110011", 6),
                Arguments.of("10101", 4),
                Arguments.of("010101", 5),
                Arguments.of("01".repeat(100000), 200000),
                Arguments.of("1".repeat(50000) + "0".repeat(50000), 50000)
        );
    }
}