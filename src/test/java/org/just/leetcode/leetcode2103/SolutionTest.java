package org.just.leetcode.leetcode2103;

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
        int actual = solution.countPoints(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("B0B6G0R6R0R6G9", 1),
                Arguments.of("B0R0G0R9R0B0G0", 1),
                Arguments.of("G4", 0),
                Arguments.of("B0R0G0".repeat(50), 1)
        );
    }
}