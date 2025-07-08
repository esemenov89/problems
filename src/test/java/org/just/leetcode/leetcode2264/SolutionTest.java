package org.just.leetcode.leetcode2264;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.largestGoodInteger(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("6777133339", "777"),
                Arguments.of("2300019", "000"),
                Arguments.of("42352338", ""),
                Arguments.of("777", "777"),
                Arguments.of("077", ""),
                Arguments.of("777999".repeat(167), "999")
        );
    }
}