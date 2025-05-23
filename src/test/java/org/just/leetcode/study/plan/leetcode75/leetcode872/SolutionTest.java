package org.just.leetcode.study.plan.leetcode75.leetcode872;

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
    void leafSimilar(TreeNode root1, TreeNode root2, boolean expected) {
        boolean actual = solution.leafSimilar(root1, root2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), generateTreeNode1(), true),
                Arguments.of(generateTreeNode21(), generateTreeNode22(), true),
                Arguments.of(generateTreeNode31(), generateTreeNode32(), false),
                Arguments.of(new TreeNode(1), new TreeNode(1), true),
                Arguments.of(generateTreeNode(), generateTreeNode(), true)
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(9);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        TreeNode right = new TreeNode(20, rightLeft, rightRight);
        return new TreeNode(3, left, right);
    }

    private static TreeNode generateTreeNode21() {
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