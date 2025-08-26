package org.just.leetcode.leetcode2299;

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
    void testSolution(String arg1, boolean expected) {
        boolean actual = solution.strongPasswordCheckerII(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("IloveLe3tcode!", true),
                Arguments.of("Me+You--IsMyDream", false),
                Arguments.of("1aB!", false),
                Arguments.of("IloveLe3tcode!", true),
                Arguments.of("IloveLe3tcode!", true)
        );
    }
}