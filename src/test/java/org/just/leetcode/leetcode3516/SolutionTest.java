package org.just.leetcode.leetcode3516;

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
    void testSolution(int arg1, int arg2, int arg3, int expected) {
        int actual = solution.findClosest(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2, 7, 4, 1),
                Arguments.of(2, 5, 6, 2),
                Arguments.of(1, 5, 3, 0)
        );
    }
}