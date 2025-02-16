package org.just.leetcode.study.plan.leetcode75.leetcode872;

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
    void leafSimilar(TreeNode root1, TreeNode root2, boolean expected) {
        boolean actual = solution.leafSimilar(root1, root2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                //Arguments.of(generateTreeNode1(), generateTreeNode1(), true),
                Arguments.of(generateTreeNode21(), generateTreeNode22(), true),
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