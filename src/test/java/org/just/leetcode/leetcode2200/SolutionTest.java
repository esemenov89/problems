package org.just.leetcode.leetcode2200;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(int[] arg1, int arg2, int arg3, List<Integer> expected) {
        List<Integer> actual = solution.findKDistantIndices(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1, List.of(1, 2, 3, 4, 5, 6)),
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 2, 2, List.of(0, 1, 2, 3, 4)),
                Arguments.of(new int[]{1}, 9, 1, List.of()),
                Arguments.of(new int[]{1}, 1, 1, List.of(0))
        );
    }
}