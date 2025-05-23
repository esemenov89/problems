package org.just.leetcode.leetcode3280;

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
    void convertDateToBinary(String jewels, String expected) {
        String actual = solution.convertDateToBinary(jewels);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("2080-02-29", "100000100000-10-11101"),
                Arguments.of("1900-01-01", "11101101100-1-1"),
                Arguments.of("9999-12-31", "10011100001111-1100-11111")
        );
    }
}