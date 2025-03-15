package org.just.leetcode.leetcode1773;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(List<List<String>> arg1, String arg2, String arg3, int expected) {
        int actual = solution.countMatches(arg1, arg2, arg3);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone")),
                        "color", "silver", 1),
                Arguments.of(List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "phone"), List.of("phone", "gold", "iphone")),
                        "type", "phone", 2),
                Arguments.of(List.of(List.of("phone", "blue", "pixel"), List.of("phone", "silver", "lenovo"), List.of("phone", "gold", "iphone")),
                        "type", "phone", 3)
        );
    }
}