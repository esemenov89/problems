package org.just.leetcode.study.plan.leetcode75.leetcode450;

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
    void testSolution(TreeNode arg1, int arg2, TreeNode expected) {
        TreeNode actual = solution.deleteNode(arg1, arg2);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 3, generateTreeNodeResult1()),
                Arguments.of(generateTreeNode2(), 0, generateTreeNode2()),
                Arguments.of(null, 0, null),
                Arguments.of(generateTreeNode(), 200, generateTreeNode())
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));

        return new TreeNode(5, left, right);
    }

    private static TreeNode generateTreeNodeResult1() {
        TreeNode left = new TreeNode(4, new TreeNode(2), null);
        TreeNode right = new TreeNode(6, null, new TreeNode(7));

        return new TreeNode(5, left, right);
    }

    private static TreeNode generateTreeNode2() {
        TreeNode left = new TreeNode(2, null, new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));

        return new TreeNode(5, left, right);
    }

    private static TreeNode generateTreeNode3() {
        return new TreeNode(1, null, new TreeNode(3));
    }

    private static TreeNode generateTreeNode4() {
        TreeNode left = new TreeNode(1, new TreeNode(1), null);
        TreeNode right = new TreeNode(1, null, new TreeNode(1));

        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode lastLeft = root;
        TreeNode lastRight = root;
        for (int i = 0; i < 100; i++) {
            lastLeft.left = new TreeNode(200);
            lastLeft = lastLeft.left;

            lastRight.right = new TreeNode(200);
            lastRight = lastRight.right;
        }
        return root;
    }
}