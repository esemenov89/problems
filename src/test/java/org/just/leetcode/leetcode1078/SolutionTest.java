package org.just.leetcode.leetcode1078;

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
    void testSolution(String arg1, String arg2, String arg3, String[] expected) {
        String[] actual = solution.findOcurrences(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("alice is a good girl she is a good student", "a", "good", new String[]{"girl", "student"}),
                Arguments.of("we will we will rock you", "we", "will", new String[]{"we", "rock"}),
                Arguments.of("a good", "a", "good", new String[]{}),
                Arguments.of("a good girl", "a", "good", new String[]{"girl"})
        );
    }
}