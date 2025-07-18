package org.just.leetcode.leetcode917;

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
        String actual = solution.reverseOnlyLetters(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("a", "a"),
                Arguments.of("ab", "ba"),
                Arguments.of("ab-cd", "dc-ba"),
                Arguments.of("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
                Arguments.of("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!"),
                Arguments.of("ab-".repeat(33), "ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-ba-")
        );
    }
}