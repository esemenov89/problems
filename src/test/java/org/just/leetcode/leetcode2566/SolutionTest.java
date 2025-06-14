package org.just.leetcode.leetcode2566;

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
    void testSolution(int arg1, int expected) {
        int actual = solution.minMaxDifference(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(95334529, 94000409),
                Arguments.of(11891, 99009),
                Arguments.of(1, 9),
                Arguments.of(10, 90),
                Arguments.of(90, 99),
                Arguments.of(999, 999),
                Arguments.of(100000000, 900000000)
        );
    }
}