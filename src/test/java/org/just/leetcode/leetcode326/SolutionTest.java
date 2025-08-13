package org.just.leetcode.leetcode326;

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
    void testSolution(int arg1, boolean expected) {
        boolean actual = solution.isPowerOfThree(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(27, true),
                Arguments.of(0, false),
                Arguments.of(-1, false),
                Arguments.of(5, false),
                Arguments.of(4, false)
        );
    }
}