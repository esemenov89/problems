package org.just.leetcode.leetcode2094;

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
    void testSolution(int[] arg1, int[] expected) {
        int[] actual = solution.findEvenNumbers(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 0}, new int[]{102, 120, 130, 132, 210, 230, 302, 310, 312, 320}),
                Arguments.of(new int[]{2, 2, 8, 8, 2}, new int[]{222, 228, 282, 288, 822, 828, 882}),
                Arguments.of(new int[]{3, 7, 5}, new int[]{}),
                Arguments.of(generateArray(), new int[]{112, 122, 212, 222})
        );
    }

    private static int[] generateArray() {
        int[] result = new int[100];
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = 1;
            } else {
                result[i] = 2;
            }
        }
        return result;
    }
}