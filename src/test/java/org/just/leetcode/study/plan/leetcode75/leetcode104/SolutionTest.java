package org.just.leetcode.study.plan.leetcode75.leetcode104;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideStrings")
    void maxDepth(TreeNode root, int expected) {
        int actual = solution.maxDepth(root);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 3)
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(9);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        TreeNode right = new TreeNode(20, rightLeft, rightRight);
        return new TreeNode(3, left, right);
    }
}