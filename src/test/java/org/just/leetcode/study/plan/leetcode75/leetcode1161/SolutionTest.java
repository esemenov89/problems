package org.just.leetcode.study.plan.leetcode75.leetcode1161;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testSolution(TreeNode arg1, int expected) {
        int actual = solution.maxLevelSum(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), 2),
                Arguments.of(generateTreeNode2(), 2),
                Arguments.of(generateTreeNode3(), List.of(1, 3)),
                Arguments.of(null, emptyList()),
                Arguments.of(generateTreeNode(), 200)
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(7, new TreeNode(7), new TreeNode(-8));

        return new TreeNode(1, left, new TreeNode(0));
    }

    private static TreeNode generateTreeNode2() {
        TreeNode rightLeft = new TreeNode(-89388, null, new TreeNode(-32127));

        TreeNode right = new TreeNode(10250, new TreeNode(98693), rightLeft);

        return new TreeNode(989, null, right);
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