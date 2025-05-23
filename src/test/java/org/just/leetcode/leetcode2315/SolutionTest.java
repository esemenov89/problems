package org.just.leetcode.leetcode2315;

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
        int actual = solution.countAsterisks(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("l|*e*et|c**o|*de|", 2),
                Arguments.of("iamprogrammer", 0),
                Arguments.of("yo|uar|e**|b|e***au|tifu|l", 5),
                Arguments.of("*".repeat(1000), 1000),
                Arguments.of("|***|" + "*".repeat(1000), 1000)
        );
    }
}