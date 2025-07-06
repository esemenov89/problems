package org.just.leetcode.leetcode3232;

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
    void testSolution(int[] arg1, boolean expected) {
        boolean actual = solution.canAliceWin(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 10}, false),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 14}, true),
                Arguments.of(new int[]{5, 5, 5, 25}, true),
                Arguments.of(generateArray(), true)
        );
    }

    private static int[] generateArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}