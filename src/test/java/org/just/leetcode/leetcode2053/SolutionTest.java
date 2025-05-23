package org.just.leetcode.leetcode2053;

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
    void kthDistinct(String[] arr, int k, String expected) {
        String actual = solution.kthDistinct(arr, k);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"d", "b", "c", "b", "c", "a"}, 2, "a"),
                Arguments.of(new String[]{"aaa", "aa", "a"}, 1, "aaa"),
                Arguments.of(new String[]{"a", "b", "a"}, 3, ""),
                Arguments.of(new String[]{"d", "b", "b", "b", "c", "c", "a"}, 2, "a"),
                Arguments.of(new String[]{"d", "b", "b", "b", "c", "c", "a"}, 10, ""),
                Arguments.of(generateStrings(), 1, "aa"),
                Arguments.of(new String[]{"a"}, 3, ""),
                Arguments.of(new String[]{"a"}, 1, "a")
        );
    }

    private static String[] generateStrings() {
        String[] arr = new String[1000];
        for (int i = 0; i < 1000; i++) {
            if (i == 800) {
                arr[i] = "aa";
            } else {
                arr[i] = "u";
            }
        }
        return arr;
    }
}