package org.just.leetcode.leetcode2490;

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
        boolean actual = solution.isCircularSentence(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("leetcode exercises sound delightful", true),
                Arguments.of("eetcode", true),
                Arguments.of("Leetcode is cool", false),
                Arguments.of("test", true),
                Arguments.of("table", false),
                Arguments.of("a".repeat(100), true),
                Arguments.of("a".repeat(50) + "b".repeat(50), false)
        );
    }
}