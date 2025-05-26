package org.just.leetcode.leetcode3274;

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
    void testSolution(String arg1, String arg2, boolean expected) {
        boolean actual = solution.checkTwoChessboards(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("a1", "c3", false),
                Arguments.of("a1", "h3", false),
                Arguments.of("a1", "c3", false),
                Arguments.of("a1", "c3", false)
        );
    }
}