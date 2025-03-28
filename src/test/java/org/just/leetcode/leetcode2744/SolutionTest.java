package org.just.leetcode.leetcode2744;

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
    void testSolution(String[] arg1, int expected) {
        int actual = solution.maximumNumberOfStringPairs(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"cd", "ac", "dc", "ca", "zz"}, 2),
                Arguments.of(new String[]{"ab", "ba", "cc"}, 1),
                Arguments.of(new String[]{"aa", "ab"}, 0),
                Arguments.of(new String[]{"aa", "aa"}, 1),
                Arguments.of(new String[]{"aa", "aa", "aa"}, 1)
        );
    }
}