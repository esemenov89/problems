package org.just.leetcode.leetcode2325;

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
    void testSolution(String arg1, String arg2, String expected) {
        String actual = solution.decodeMessage(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv", "this is a secret"),
                Arguments.of("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb", "the five boxing wizards jump quickly"),
                Arguments.of("the quick brown fox jumps over the lazy dog".repeat(100), "vkbs bs t suepuv".repeat(100), "this is a secret".repeat(100))
        );
    }
}