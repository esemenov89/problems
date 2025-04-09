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
                Arguments.of("a1c1e1", "abcdef"),
                Arguments.of("a1b2c3d4e", "abbdcfdhe"),
                Arguments.of("a9b9".repeat(25), "ajbk".repeat(25))
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