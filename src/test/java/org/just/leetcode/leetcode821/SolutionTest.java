package org.just.leetcode.leetcode821;

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
    void testSolution(String arg1, char arg2, int[] expected) {
        int[] actual = solution.shortestToChar(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("loveleetcode", 'e', new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}),
                Arguments.of("aaab", 'b', new int[]{3, 2, 1, 0})
        );
    }
}