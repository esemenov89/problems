package org.just.leetcode.leetcode771;

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
    void numJewelsInStones(String jewels, String stones, int expected) {
        int actual = solution.numJewelsInStones(jewels, stones);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("aA", "aAAbbbb", 3),
                Arguments.of("z", "ZZ", 0),
                Arguments.of("kKc", "cccc", 4),
                Arguments.of("abc", generateString(), 50)
        );
    }

    private static String generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                stringBuilder.append("a");
            } else if (i % 3 == 1) {
                stringBuilder.append("b");
            } else {
                stringBuilder.append("c");
            }
        }
        return stringBuilder.toString();
    }
}