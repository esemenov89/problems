package org.just.leetcode.leetcode1108;

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
    void defangIPaddr(String s, String expected) {
        String actual = solution.defangIPaddr(s);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1.1.1.1", "1[.]1[.]1[.]1"),
                Arguments.of("255.100.50.0", "255[.]100[.]50[.]0"),
                Arguments.of("10.11.12.13", "10[.]11[.]12[.]13")
        );
    }
}