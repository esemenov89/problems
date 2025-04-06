package org.just.leetcode.leetcode1614;

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
    void testSolution(String arg1, int expected) {
        int actual = solution.maxDepth(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("(1+(2*3)+((8)/4))+1", 3),
                Arguments.of("(1)+((2))+(((3)))", 3),
                Arguments.of("()(())((()()))", 3),
                Arguments.of("(".repeat(50) + ")".repeat(50), 50)
        );
    }
}