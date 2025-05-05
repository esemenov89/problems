package org.just.leetcode.leetcode2278;

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
    void testSolution(String arg1, char arg2, int expected) {
        int actual = solution.percentageLetter(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("foobar", 'o', 33),
                Arguments.of("jjjj", 'k', 0),
                Arguments.of("j", 'k', 0),
                Arguments.of("a".repeat(100), 'a', 100)
        );
    }
}