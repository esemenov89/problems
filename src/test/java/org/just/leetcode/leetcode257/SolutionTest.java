package org.just.leetcode.leetcode257;

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
    void testSolution(TreeNode arg1, List<String> expected) {
        List<String> actual = solution.binaryTreePaths(arg1);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(generateTreeNode1(), List.of("1->2->5","1->3")),
                Arguments.of(new TreeNode(1), List.of("1")),
                Arguments.of(generateTreeNode2(), List.of("1")),
                Arguments.of(new TreeNode(1), List.of("1->2->5","1->3")),
                Arguments.of(generateTreeNode(), List.of("1->2->5","1->3")),
                Arguments.of(generateTreeNode3(), List.of("1->2->5","1->3"))
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode leftRight = new TreeNode(5);
        TreeNode left = new TreeNode(2, null, leftRight);
        TreeNode right = new TreeNode(3, null, null);
        return new TreeNode(1, left, right);
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