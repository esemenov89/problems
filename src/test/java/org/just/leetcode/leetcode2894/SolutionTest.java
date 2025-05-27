package org.just.leetcode.leetcode2894;

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
    void testSolution(int arg1, int arg2, int expected) {
        int actual = solution.differenceOfSums(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(10, 3, 19),
                Arguments.of(5, 6, 15),
                Arguments.of(5, 1, -15),
                Arguments.of(1000, 1, -500500)
        );
    }
}