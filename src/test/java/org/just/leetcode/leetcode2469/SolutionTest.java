package org.just.leetcode.leetcode2469;

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
    void testSolution(double arg1, double[] expected) {
        double[] actual = solution.convertTemperature(arg1); // test commit

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(36.50, new double[]{309.65000, 97.70000}),
                Arguments.of(122.11, new double[]{395.26000, 251.79800}),
                Arguments.of(999.99999, new double[]{1273.14999, 1831.99998})
        );
    }
}