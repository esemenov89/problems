package org.just.leetcode.study.plan.leetcode75.leetcode199;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
                Arguments.of(generateTreeNode1(), List.of(1, 3, 4)),
                Arguments.of(generateTreeNode2(), List.of(1, 3, 4)),
                Arguments.of(generateTreeNode3(), List.of(1, 3, 4))
        );
    }

    private static TreeNode generateTreeNode1() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3, null, new TreeNode(4));

        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode2() {
        TreeNode leftRight = new TreeNode(2, new TreeNode(7), new TreeNode(4));

        TreeNode left = new TreeNode(5, new TreeNode(6), leftRight);
        TreeNode right = new TreeNode(1, new TreeNode(0), new TreeNode(8));

        return new TreeNode(3, left, right);
    }

    private static TreeNode generateTreeNode3() {
        return new TreeNode(1, new TreeNode(2), null);
    }

    private static TreeNode generateTreeNode4() {
        TreeNode left = new TreeNode(1, new TreeNode(1), null);
        TreeNode right = new TreeNode(1, null, new TreeNode(1));

        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode5() {
        TreeNode leftRightLeft = new TreeNode(1, new TreeNode(1), null);
        TreeNode leftRight = new TreeNode(1, leftRightLeft, new TreeNode(1));
        TreeNode left = new TreeNode(1, null, leftRight);

        return new TreeNode(1, left, null);
    }

    private static TreeNode generateTreeNode6() {
        TreeNode rightRightRight = new TreeNode(1, new TreeNode(1), null);

        TreeNode rightRight = new TreeNode(1, new TreeNode(1), rightRightRight);

        TreeNode left = new TreeNode(1, new TreeNode(1), new TreeNode(1));
        TreeNode right = new TreeNode(1, new TreeNode(1), rightRight);

        return new TreeNode(1, null, right);
    }
}