package org.just.leetcode.leetcode1662;

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
    void testSolution(String[] arg1, String[] arg2, boolean expected) {
        boolean actual = solution.arrayStringsAreEqual(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true),
                Arguments.of(generateStrings(), generateStrings(), true)
        );
    }

    private static String[] generateStrings() {
        String[] strings = new String[1000];
        for (int i = 0; i < 1000; i++) {
            strings[i] = String.valueOf(i).repeat(1000);
        }
        return strings;
    }
}