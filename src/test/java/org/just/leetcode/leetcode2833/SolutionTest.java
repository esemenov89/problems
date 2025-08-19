package org.just.leetcode.leetcode2833;

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
        int actual = solution.furthestDistanceFromOrigin(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("L_RL__R", 3),
                Arguments.of("_R__LL_", 5),
                Arguments.of("_______", 7),
                Arguments.of("_".repeat(50), 50),
                Arguments.of("LR".repeat(25), 0)
        );
    }
}