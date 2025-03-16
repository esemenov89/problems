package org.just.leetcode.study.plan.leetcode75.leetcode435;

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
    void testSolution(TreeNode arg1, int arg2, int expected) {
        int actual = solution.pathSum(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 8, 3),
                Arguments.of(generateTreeNode2(), 3),
                Arguments.of(new TreeNode(1), 1),
                Arguments.of(generateTreeNode4(), 4),
                Arguments.of(generateTreeNode(), 200001)
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
        TreeNode leftLeft = new TreeNode(4);
        TreeNode leftRight = new TreeNode(2);
        TreeNode left = new TreeNode(3, leftLeft, leftRight);

        return new TreeNode(3, left, null);
    }

    private static TreeNode generateTreeNode4() {
        TreeNode rightRightLeft = new TreeNode(4);
        TreeNode rightLeft = new TreeNode(10);
        TreeNode rightRight = new TreeNode(8, rightRightLeft, null);
        TreeNode right = new TreeNode(4, rightLeft, rightRight);

        return new TreeNode(2, null, right);
    }

    private static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode lastLeft = root;
        TreeNode lastRight = root;
        for (int i = 0; i < 10000; i++) {
            lastLeft.left = new TreeNode(200);
            lastLeft = lastLeft.left;

            lastRight.right = new TreeNode(200);
            lastRight = lastRight.right;
        }
        return root;
    }
}