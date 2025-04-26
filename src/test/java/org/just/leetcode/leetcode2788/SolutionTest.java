package org.just.leetcode.leetcode2788;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(List<String> arg1, char arg2, List<String> expected) {
        List<String> actual = solution.splitWordsBySeparator(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of("one.two.three","four.five","six"), '.', List.of("one","two","three","four","five","six")),
                Arguments.of(List.of("$easy$","$problem$"), '$', List.of("easy","problem")),
                Arguments.of(List.of(",easy,",",problem,"), ',', List.of("easy","problem")),
                Arguments.of(List.of("#easy#","#problem#"), '#', List.of("easy","problem")),
                Arguments.of(List.of("@easy@","@problem@"), '@', List.of("easy","problem")),
                Arguments.of(List.of("@easy@".repeat(50),"@problem@".repeat(50)), '@',
                        List.of("easy,".repeat(50).split(","),"problem".repeat(50).split(","))),
                Arguments.of(List.of("|||"), '|', emptyList())
        );
    }
}