package org.just.leetcode.leetcode824;

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
        String actual = solution.toGoatLatin(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"),
                Arguments.of("The quick brown fox jumped over the lazy dog", "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"),
                Arguments.of("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"),
                Arguments.of("I speak ".repeat(75), "Imaa peaksmaaa oatGmaaaa atinLmaaaaa")
        );
    }
}