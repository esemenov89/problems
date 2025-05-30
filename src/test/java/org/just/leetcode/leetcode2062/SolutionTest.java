package org.just.leetcode.leetcode2062;

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
    void testSolution(String arg1, int expected) {
        int actual = solution.countVowelSubstrings(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("vmvmxbmcnhqejkplswrmzcikhaiaiiueiuoiuauoaiaoiuoaooljzaculyiyqeshweyqbbdtfzkueuiiuooeeeauooaiiaaaiuou", 224),
                Arguments.of("aeiouu", 2),
                Arguments.of("unicornarihan", 0),
                Arguments.of("cuaieuouac", 7),
                Arguments.of("aeiou".repeat(20), 4656)
        );
    }
}