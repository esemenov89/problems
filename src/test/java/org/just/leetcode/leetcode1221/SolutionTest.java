package org.just.leetcode.leetcode1221;

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
    void testSolution(String arg1, int expected) {
        int actual = solution.balancedStringSplit(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("RLRRLLRLRL", 4),
                Arguments.of("RLRRRLLRLL", 2),
                Arguments.of("LLLLRRRR", 1),
                Arguments.of("RLRRLLRLRL", 4)
        );
    }
}