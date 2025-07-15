package org.just.leetcode.leetcode3136;

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
    void testSolution(String arg1, boolean expected) {
        boolean actual = solution.isValid(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("234Adas", true),
                Arguments.of("Ab", false),
                Arguments.of("Ab3", true),
                Arguments.of("AbC", true),
                Arguments.of("Ab@", false),
                Arguments.of("b3", false),
                Arguments.of("a3$e", false),
                Arguments.of("234Adas", true),
                Arguments.of("234Adas", true)
        );
    }
}