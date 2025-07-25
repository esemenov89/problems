package org.just.leetcode.leetcode242;

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
    void testSolution(String arg1, String arg2, boolean expected) {
        boolean actual = solution.isAnagram(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("r", "car", false),
                Arguments.of("car", "r", false),
                Arguments.of("a".repeat(50000), "b".repeat(50000), false),
                Arguments.of("a".repeat(50000), "a".repeat(50000), true)
        );
    }
}