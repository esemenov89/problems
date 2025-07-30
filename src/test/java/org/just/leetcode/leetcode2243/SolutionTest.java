package org.just.leetcode.leetcode2243;

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
    void testSolution(String arg1, int arg2, String expected) {
        String actual = solution.digitSum(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("11111222223", 3, "135"),
                Arguments.of("00000000", 3, "000"),
                Arguments.of("1", 2, "1"),
                Arguments.of("0".repeat(100), 2, "00"),
                Arguments.of("0".repeat(100), 99, "00")
        );
    }
}