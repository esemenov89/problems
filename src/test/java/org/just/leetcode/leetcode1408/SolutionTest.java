package org.just.leetcode.leetcode1408;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String[] arg1, List<String> expected) {
        List<String> actual = solution.stringMatching(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"mass", "as", "hero", "superhero"}, List.of("as", "hero")),
                Arguments.of(new String[]{"leetcode", "et", "code"}, List.of("et", "code")),
                Arguments.of(new String[]{"blue", "green", "bu"}, List.of())
        );
    }
}