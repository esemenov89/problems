package org.just.leetcode.leetcode1507;

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
        String actual = solution.reformatDate(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("20th Oct 2052", "2052-10-20"),
                Arguments.of("6th Jun 1933", "1933-06-06"),
                Arguments.of("26th May 1960", "1960-05-26"),
                Arguments.of("1th Jan 1900", "1900-01-01")
        );
    }
}