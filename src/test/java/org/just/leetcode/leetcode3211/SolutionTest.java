package org.just.leetcode.leetcode3211;

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
    void testSolution(int arg1, List<String> expected) {
        List<String> actual = solution.validStrings(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(3, List.of("010", "011", "101", "110", "111")),
                Arguments.of(1, List.of("0", "1")),
                Arguments.of("(al)G(al)()()G", "alGalooG")
        );
    }
}