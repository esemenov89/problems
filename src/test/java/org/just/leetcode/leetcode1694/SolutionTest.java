package org.just.leetcode.leetcode1694;

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
        String actual = solution.reformatNumber(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("1-23-45 6", "123-456"),
                Arguments.of("123 4-567", "123-45-67"),
                Arguments.of("123 4-5678", "123-456-78"),
                Arguments.of("1-23-45 6", "123-456")
        );
    }
}