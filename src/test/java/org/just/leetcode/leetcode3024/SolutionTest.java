package org.just.leetcode.leetcode3024;

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
    void testSolution(int[] arg1, String expected) {
        String actual = solution.triangleType(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 3, 3}, "equilateral"),
                Arguments.of(new int[]{3, 4, 5}, "scalene"),
                Arguments.of(new int[]{3, 4, 3}, "isosceles"),
                Arguments.of(new int[]{100, 4, 5}, "none")
        );
    }
}