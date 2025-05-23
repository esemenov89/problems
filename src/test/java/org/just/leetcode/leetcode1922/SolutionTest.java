package org.just.leetcode.leetcode1922;

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
    void testSolution(long arg1, int expected) {
        int actual = solution.countGoodNumbers(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 5),
                Arguments.of(4, 400),
                Arguments.of(50, 564908303),
                Arguments.of(1_000_000_000_000_000L, 711414395)
        );
    }
}