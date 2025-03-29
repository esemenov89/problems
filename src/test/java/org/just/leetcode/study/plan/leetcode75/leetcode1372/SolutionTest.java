package org.just.leetcode.study.plan.leetcode75.leetcode1372;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void leafSimilar(TreeNode arg1, int expected) {
        int actual = solution.longestZigZag(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 3),
                Arguments.of(generateTreeNode2(), 4),
                Arguments.of(new TreeNode(1), 0)
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
        TreeNode leftRightLeft = new TreeNode(7);
        TreeNode leftRightRight = new TreeNode(4);
        TreeNode leftRight = new TreeNode(2, leftRightLeft, leftRightRight);
        TreeNode leftLeft = new TreeNode(6);
        TreeNode left = new TreeNode(5, leftLeft, leftRight);

        TreeNode rightLeft = new TreeNode(9);
        TreeNode rightRight = new TreeNode(8);
        TreeNode right = new TreeNode(1, rightLeft, rightRight);
        return new TreeNode(3, left, right);
    }

    private static TreeNode generateTreeNode22() {
        TreeNode leftLeft = new TreeNode(6);
        TreeNode leftRight = new TreeNode(7);
        TreeNode left = new TreeNode(5, leftLeft, leftRight);

        TreeNode rightRightLeft = new TreeNode(9);
        TreeNode rightRightRight = new TreeNode(8);
        TreeNode rightLeft = new TreeNode(4);
        TreeNode rightRight = new TreeNode(2, rightRightLeft, rightRightRight);
        TreeNode right = new TreeNode(1, rightLeft, rightRight);
        return new TreeNode(3, left, right);
    }

    private static TreeNode generateTreeNode31() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode32() {
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode last = root;
        for (int i = 0; i < 200; i++) {
            last.left = new TreeNode(200);
            last = last.left;
        }
        return root;
    }
}