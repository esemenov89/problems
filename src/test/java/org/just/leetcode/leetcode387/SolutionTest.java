package org.just.leetcode.leetcode387;

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
        int actual = solution.firstUniqChar(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("leetcode!", 0),
                Arguments.of("loveleetcode!", 2),
                Arguments.of("aabb", -1),
                Arguments.of("aabb".repeat(100000), -1)
        );
    }
}