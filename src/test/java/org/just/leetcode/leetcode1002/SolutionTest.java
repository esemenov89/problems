package org.just.leetcode.leetcode1002;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String[] arg1, List<String> expected) {
        List<String> actual = solution.commonChars(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"bella", "label", "roller"}, List.of("e", "l", "l")),
                Arguments.of(new String[]{"cool", "lock", "cook"}, List.of("c", "o")),
                Arguments.of(generateWords(), generateAnswer())
        );
    }

    private static String[] generateWords() {
        String[] words = new String[100];
        Arrays.fill(words, "a".repeat(100));
        return words;
    }

    private static List<String> generateAnswer() {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            answer.add("a");
        }
        return answer;
    }
}