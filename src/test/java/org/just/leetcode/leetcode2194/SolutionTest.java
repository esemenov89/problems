package org.just.leetcode.leetcode2194;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String arg1, List<String> expected) {
        List<String> actual = solution.cellsInRange(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("K1:L2", List.of("K1", "K2", "L1", "L2")),
                Arguments.of("A1:F1", List.of("A1", "B1", "C1", "D1", "E1", "F1")),
                Arguments.of("A1:A9", List.of("A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9")),
                Arguments.of("A2:A8", List.of("A2", "A3", "A4", "A5", "A6", "A7", "A8")),
                Arguments.of("A2:B8", List.of("A2", "A3", "A4", "A5", "A6", "A7", "A8", "B2", "B3", "B4", "B5", "B6", "B7", "B8")),
                Arguments.of("LOVELY", "lovely"),
                Arguments.of("LOVELY", "lovely")
        );
    }
}