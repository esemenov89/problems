package org.just.leetcode.leetcode535;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(String arg1, String expected) {
        Codec obj = new Codec();

        String tiny = obj.encode(arg1);
        String actual = obj.decode(tiny);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("https://leetcode.com/problems/design-tinyurl", "https://leetcode.com/problems/design-tinyurl"),
                Arguments.of("https://leetcode.com/problems/design-tinyurl/", "https://leetcode.com/problems/design-tinyurl/"),
                Arguments.of("https://actor.example.com/brake?bubble=bag", "https://actor.example.com/brake?bubble=bag"),
                Arguments.of("https://leetcode.com", "https://leetcode.com")
        );
    }
}