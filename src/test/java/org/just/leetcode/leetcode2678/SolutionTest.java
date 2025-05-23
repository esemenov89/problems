package org.just.leetcode.leetcode2678;

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
    void testSolution(String[] arg1, int expected) {
        int actual = solution.countSeniors(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}, 2),
                Arguments.of(new String[]{"1313579440F2036", "2921522980M5644"}, 0),
                Arguments.of(new String[]{"1313579440F2036", "2921522980M9944"}, 1)
        );
    }
}