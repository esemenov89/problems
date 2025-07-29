package org.just.leetcode.leetcode2192;

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
    void testSolution(String arg1, String expected) {
        String actual = solution.capitalizeTitle(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("capiTalIze tHe titLe", "Capitalize The Title"),
                Arguments.of("First leTTeR of EACH Word", "First Letter of Each Word"),
                Arguments.of("i lOve leetcode", "i Love Leetcode"),
                Arguments.of("a", "a"),
                Arguments.of("A", "a"),
                Arguments.of("A".repeat(100), "A" + "a".repeat(99))
        );
    }
}