package org.just.leetcode.leetcode1832;

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
    void testSolution(String arg1, boolean expected) {
        boolean actual = solution.checkIfPangram(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("thequickbrownfoxjumpsoverthelazydog", true),
                Arguments.of("leetcode", false),
                Arguments.of(new String[]{"def", "ghi"}, ""),
                Arguments.of(new String[]{"abba", "ghi"}, "abba"),
                Arguments.of(new String[]{"a", "ghi"}, "a"),
                Arguments.of(new String[]{"aa", "ghi"}, "aa")
        );
    }
}