package org.just.leetcode.leetcode1528;

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
    void testSolution(String arg1, int[] arg2, String expected) {
        String actual = solution.restoreString(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}, "leetcode"),
                Arguments.of("abc", new int[]{0, 1, 2}, "abc"),
                Arguments.of("codeleeta", new int[]{4, 5, 6, 7, 0, 2, 1, 3, 8}, "leetcodea")
        );
    }
}