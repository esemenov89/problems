package org.just.leetcode.study.plan.leetcode75.leetcode435;

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
    void testSolution(TreeNode arg1, int arg2, int expected) {
        int actual = solution.pathSum(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 8, 3),
                Arguments.of(generateTreeNode2(), 22, 3),
                Arguments.of(new TreeNode(1), 1, 1),
                Arguments.of(new TreeNode(1), 0, 0),
                Arguments.of(generateTreeNode3(), 0, 0),
                Arguments.of(null, 4, 0),
                Arguments.of(generateTreeNode(), 8, 2002)
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode leftLeftLeft = new TreeNode(3);
        TreeNode leftLeftRight = new TreeNode(-2);
        TreeNode leftLeft = new TreeNode(3, leftLeftLeft, leftLeftRight);
        TreeNode leftRightRight = new TreeNode(1);
        TreeNode leftRight = new TreeNode(2, null, leftRightRight);
        TreeNode left = new TreeNode(5, leftLeft, leftRight);

        TreeNode rightRight = new TreeNode(11);
        TreeNode right = new TreeNode(-3, null, rightRight);
        return new TreeNode(10, left, right);
    }

    private static TreeNode generateTreeNode2() {
        TreeNode leftLeftRight = new TreeNode(2);
        TreeNode leftLeftLeft = new TreeNode(7);
        TreeNode leftLeft = new TreeNode(11, leftLeftLeft, leftLeftRight);
        TreeNode left = new TreeNode(4, leftLeft, null);

        TreeNode rightRightRight = new TreeNode(1);
        TreeNode rightRightLeft = new TreeNode(5);
        TreeNode rightRight = new TreeNode(4, rightRightLeft, rightRightRight);
        TreeNode rightLeft = new TreeNode(13);
        TreeNode right = new TreeNode(8, rightLeft, rightRight);

        return new TreeNode(5, left, right);
    }

    private static TreeNode generateTreeNode3() {
        TreeNode leftLeftLeftLeftLeft = new TreeNode(1000000000);
        TreeNode leftLeftLeftLeft = new TreeNode(1000000000, leftLeftLeftLeftLeft, null);
        TreeNode leftLeftLeft = new TreeNode(1000000000, leftLeftLeftLeft, null);
        TreeNode leftLeft = new TreeNode(294967296, leftLeftLeft, null);

        TreeNode left = new TreeNode(1000000000, leftLeft, null);

        return new TreeNode(1000000000, left, null);
    }

    private static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(0);
        TreeNode lastLeft = root;
        TreeNode lastRight = root;
        for (int i = 0; i < 1000; i++) {
            lastLeft.left = new TreeNode(8);
            lastLeft = lastLeft.left;

            lastRight.right = new TreeNode(8);
            lastRight = lastRight.right;
        }
        return root;
    }
}