package org.just.leetcode.leetcode1945;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void getLucky() {
        String s = "iiii";
        int k = 1;

        int expected = 36;

        int actual = solution.getLucky(s, k);

        assertThat(actual, is(expected));
    }
}
