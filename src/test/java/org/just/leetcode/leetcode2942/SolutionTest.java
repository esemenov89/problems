package org.just.leetcode.leetcode2942;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String[] arg1, char arg2, List<Integer> expected) {
        List<Integer> actual = solution.findWordsContaining(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"leet", "code"}, 'e', List.of(0, 1)),
                Arguments.of(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a', List.of(0, 2)),
                Arguments.of(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z', List.of()),
                Arguments.of(generateStrings(), 'a', getExpected())
        );
    }

    private static String[] generateStrings() {
        String[] result = new String[50];
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = "aa";
            } else {
                result[i] = "bb";
            }
        }
        return result;
    }

    private static List<Integer> getExpected() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
}