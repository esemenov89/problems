package org.just.leetcode.leetcode1773;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(List<List<String>> arg1, String arg2, String arg3, int expected) {
        int actual = solution.countMatches(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("IIIDIDDD", "123549876"),
                Arguments.of("DDD", "4321"),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }
}