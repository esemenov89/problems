package org.just.leetcode.leetcode1221;

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
        int actual = solution.balancedStringSplit(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("RRLRRLRLLLRL", 2),
                Arguments.of("RLRRLLRLRL", 4),
                Arguments.of("RLRRRLLRLL", 2),
                Arguments.of("LLLLRRRR", 1),
                Arguments.of("RLLLLRRRLR", 3),
                Arguments.of("RL".repeat(50), 50),
                Arguments.of("R".repeat(50) + "L".repeat(50), 1)
        );
    }
}