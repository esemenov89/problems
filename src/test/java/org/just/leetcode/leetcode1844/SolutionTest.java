package org.just.leetcode.leetcode1844;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.replaceDigits(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of("alice", "bob", "charlie"), "abc", true),
                Arguments.of(List.of("an", "apple"), "a", false),
                Arguments.of(List.of("never", "gonna", "give", "up", "on", "you"), "ngguoy", true),
                Arguments.of(generateWords(), "a".repeat(100), true)
        );
    }

    private static List<String> generateWords() {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            words.add("ab");
        }
        return words;
    }
}