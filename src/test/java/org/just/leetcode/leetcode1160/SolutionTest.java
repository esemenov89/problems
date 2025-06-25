package org.just.leetcode.leetcode1160;

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
    void testSolution(String[] arg1, String arg2, int expected) {
        int actual = solution.countCharacters(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"cat", "bt", "hat", "tree"}, "atach", 1),
                Arguments.of(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr", 1)
        );
    }
}