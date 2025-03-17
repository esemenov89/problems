package org.just.leetcode.leetcode2418;

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
    void testSolution(String[] arg1, int[] arg2, String[] expected) {
        String[] actual = solution.sortPeople(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}, new String[]{"Mary", "Emma", "John"}),
                Arguments.of(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}, new String[]{"Bob", "Alice", "Bob"}),
                Arguments.of(new String[]{"a ".repeat(100), "b ".repeat(99)}, 100)
        );
    }
}