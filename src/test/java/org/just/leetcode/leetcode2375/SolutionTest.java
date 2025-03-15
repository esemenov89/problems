package org.just.leetcode.leetcode2375;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.smallestNumber(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("IIIDIDDD", "123549876"),
                Arguments.of("DDD", "4321"),
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