package org.just.leetcode.leetcode1160;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
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
                Arguments.of(new String[]{"cat", "bt", "hat", "tree"}, "atach", 6),
                Arguments.of(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr", 10),
                Arguments.of(new String[]{"a"}, "a", 1),
                Arguments.of(new String[]{"a"}, "b", 0),
                Arguments.of(generateWords(), "a".repeat(100), 100000)
        );
    }

    private static String[] generateWords() {
        String[] words = new String[1000];
        Arrays.fill(words, "a".repeat(100));
        return words;
    }
}