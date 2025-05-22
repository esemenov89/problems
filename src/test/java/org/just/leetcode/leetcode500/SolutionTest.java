package org.just.leetcode.leetcode500;

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
    void testSolution(String[] arg1, String[] expected) {
        String[] actual = solution.findWords(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"Hello","Alaska","Dad","Peace"}, new String[]{"Alaska","Dad"}),
                Arguments.of(new String[]{"omk"}, new String[]{}),
                Arguments.of(new String[]{"adsdf","sfd"}, new String[]{"adsdf","sfd"}),
                Arguments.of(new String[]{"qwertyuiop","sfd"}, new String[]{"qwertyuiop","sfd"})
        );
    }
}