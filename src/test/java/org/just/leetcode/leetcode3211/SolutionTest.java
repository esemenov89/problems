package org.just.leetcode.leetcode3211;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(int arg1, List<String> expected) {
        List<String> actual = solution.validStrings(arg1);

        assertThat(actual, equalTo(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(3, List.of("011", "110", "111", "101", "010")),
                Arguments.of(1, List.of("0", "1")),
                Arguments.of(18, List.of("011", "110", "111", "101", "010"))
        );
    }
}