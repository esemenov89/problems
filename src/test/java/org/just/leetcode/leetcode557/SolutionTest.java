package org.just.leetcode.leetcode557;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.reverseWords(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"),
                Arguments.of("Mr Ding", "rM gniD"),
                Arguments.of("aa".repeat(5000) + "bb".repeat(5000), "bb".repeat(5000) + "aa".repeat(5000))
        );
    }
}