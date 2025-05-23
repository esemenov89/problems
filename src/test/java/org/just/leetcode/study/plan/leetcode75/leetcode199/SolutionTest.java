package org.just.leetcode.study.plan.leetcode75.leetcode199;

import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(TreeNode arg1, List<Integer> expected) {
        List<Integer> actual = solution.rightSideView(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode0(), List.of(1, 3, 7)),
                Arguments.of(generateTreeNode1(), List.of(1, 3, 4)),
                Arguments.of(generateTreeNode2(), List.of(1, 3, 4, 5)),
                Arguments.of(generateTreeNode3(), List.of(1, 3)),
                Arguments.of(null, emptyList()),
                Arguments.of(generateTreeNode(), List.of(1, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                        200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                        200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                        200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                        200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                        200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200))
        );
    }

    private static TreeNode generateTreeNode0() {
        TreeNode left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode right = new TreeNode(3, new TreeNode(6), new TreeNode(7));

        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3, null, new TreeNode(4));

        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode2() {
        TreeNode leftLeft = new TreeNode(4, new TreeNode(5), null);

        TreeNode left = new TreeNode(2, leftLeft, leftLeft);

        return new TreeNode(1, left, new TreeNode(3));
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