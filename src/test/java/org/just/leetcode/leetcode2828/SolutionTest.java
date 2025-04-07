package org.just.leetcode.leetcode2828;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(List<String> arg1,String arg2, boolean expected) {
        boolean actual = solution.isAcronym(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of("alice","bob","charlie"), "abc", true),
                Arguments.of(List.of("an","apple"), "a", false),
                Arguments.of(List.of("never","gonna","give","up","on","you"), "ngguoy", true)
        );
    }
}