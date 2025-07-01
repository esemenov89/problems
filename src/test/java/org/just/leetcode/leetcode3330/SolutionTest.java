package org.just.leetcode.leetcode3330;

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
    void testSolution(String arg1, int expected) {
        int actual = solution.possibleStringCount(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("abbcccc", 5),
                Arguments.of("abcd", 1),
                Arguments.of("aaaa", 4)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[20000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000000);
        }
        return array;
    }
}