package org.just.leetcode.leetcode1816;

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
    void testSolution(String arg1, int arg2, String expected) {
        String actual = solution.truncateSentence(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("Hello how are you Contestant", 4, "Hello how are you"),
                Arguments.of("What is the solution to this problem", 4, "What is the solution"),
                Arguments.of("chopper is not a tanuki", 5, "chopper is not a tanuki"),
                Arguments.of("abc ".repeat(500), 499, "abc ".repeat(499).substring(0, 1995))
        );
    }
}