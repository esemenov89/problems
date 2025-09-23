package org.just.leetcode.leetcode748;

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
    void testSolution(String arg1, String[] arg2, String expected) {
        String actual = solution.shortestCompletingWord(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1s3 PSt", new String[] {"step","steps","stripe","stepple"}, "steps"),
                Arguments.of("1s3 456", new String[] {"looks","pest","stew","show"}, "pest"),
                Arguments.of("1s3 PSt", new String[] {"step","steps","stripe","stepple"}, "steps"),
                Arguments.of("1aaa3 AAA", new String[] {"aaa","aaaa","aaaaa","aaaaaa","aaaaaaa"}, "aaaaaa")
        );
    }
}