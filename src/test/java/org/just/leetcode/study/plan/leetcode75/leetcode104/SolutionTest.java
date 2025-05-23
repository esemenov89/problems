package org.just.leetcode.study.plan.leetcode75.leetcode104;

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
    void maxDepth(TreeNode root, int expected) {
        int actual = solution.maxDepth(root);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 3),
                Arguments.of(generateTreeNode2(), 2),
                Arguments.of(new TreeNode(1), 1),
                Arguments.of(null, 0),
                Arguments.of(generateTreeNode(), 10001),
                Arguments.of(generateTreeNode3(), 3)
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(9);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        TreeNode right = new TreeNode(20, rightLeft, rightRight);
        return new TreeNode(3, left, right);
    }

    private static TreeNode generateTreeNode2() {
        TreeNode right = new TreeNode(2);
        return new TreeNode(1, null, right);
    }

    private static TreeNode generateTreeNode3() {
        TreeNode leftLeft = new TreeNode(4);
        TreeNode left = new TreeNode(2, leftLeft, null);
        TreeNode rightLeft = new TreeNode(5);
        TreeNode right = new TreeNode(3, rightLeft, null);
        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode last = root;
        for (int i = 0; i < 10000; i++) {
            last.left = new TreeNode(i + 2);
            last = last.left;
        }
        return root;
    }
}