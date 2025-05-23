package org.just.leetcode.leetcode1859;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.sortSentence(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("is2 sentence4 This1 a3", "This is a sentence"),
                Arguments.of("Myself2 Me1 I4 and3", "Me Myself and I"),
                Arguments.of("Myself2 Me1 I4 and3 here5 hi6 all7 night9 my8", "Me Myself and I here hi all my night")
        );
    }
}