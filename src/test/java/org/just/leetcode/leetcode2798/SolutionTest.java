package org.just.leetcode.leetcode2798;

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
    void testSolution(int[] arg1, int arg2, int expected) {
        int actual = solution.numberOfEmployeesWhoMetTarget(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{0,1,2,3,4}, 2, 3),
                Arguments.of(new int[]{5,1,4,2,2}, 6, 0),
                Arguments.of(new int[]{5,1,4,2,2}, 6, 0)
        );
    }
}