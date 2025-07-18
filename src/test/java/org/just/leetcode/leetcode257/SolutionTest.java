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
                Arguments.of(generateTreeNode2(), List.of("1->2")),
                Arguments.of(generateTreeNode(), List.of("1->2->3->4->5->6->7->8->9->10->11->12->13->14->15->16->17->18->19->20->21->22->23->24->25->26->27->28->29->30->31->32->33->34->35->36->37->38->39->40->41->42->43->44->45->46->47->48->49->50->51->52->53->54->55->56->57->58->59->60->61->62->63->64->65->66->67->68->69->70->71->72->73->74->75->76->77->78->79->80->81->82->83->84->85->86->87->88->89->90->91->92->93->94->95->96->97->98->99->100->101")),
                Arguments.of(generateTreeNode3(), List.of("1->2->4", "1->3->5")),
                Arguments.of(generateTreeNode4(), List.of("1->2->3", "1->2->4", "1->20->30", "1->20->40"))
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

    private static TreeNode generateTreeNode4() {
        TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode right = new TreeNode(20, new TreeNode(30), new TreeNode(40));
        return new TreeNode(1, left, right);
    }

    private static TreeNode generateTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode last = root;
        for (int i = 0; i < 100; i++) {
            last.left = new TreeNode(i + 2);
            last = last.left;
        }
        return root;
    }
}