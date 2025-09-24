package org.just.leetcode.leetcode1869;

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
    void testSolution(String arg1, boolean expected) {
        boolean actual = solution.checkZeroOnes(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1101", true),
                Arguments.of("111000", false),
                Arguments.of("110100010", false),
                Arguments.of("1".repeat(50) + "0".repeat(50), false),
                Arguments.of("1".repeat(50) + "0".repeat(49), true)
        );
    }
}