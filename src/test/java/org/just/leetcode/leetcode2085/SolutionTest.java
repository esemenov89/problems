package org.just.leetcode.leetcode2085;

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
    void testSolution(String[] arg1, String[] arg2, int expected) {
        int actual = solution.countWords(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"}, 2),
                Arguments.of(new String[]{"b","bb","bbb"}, new String[]{"a","aa","aaa"}, 0),
                Arguments.of(new String[]{"a","ab"}, new String[]{"a","a","a","ab"}, 2)
        );
    }
}