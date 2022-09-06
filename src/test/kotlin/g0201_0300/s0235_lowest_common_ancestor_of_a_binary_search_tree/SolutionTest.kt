package g0201_0300.s0235_lowest_common_ancestor_of_a_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lowestCommonAncestor() {
        val leftNodeLeftNode = TreeNode(0)
        val leftNodeRightNode = TreeNode(4, TreeNode(3), TreeNode(5))
        val leftNode = TreeNode(2, leftNodeLeftNode, leftNodeRightNode)
        val rightNode = TreeNode(6, TreeNode(7), TreeNode(9))
        val root = TreeNode(6, leftNode, rightNode)
        assertThat(
            Solution()
                .lowestCommonAncestor(root, TreeNode(2), TreeNode(8))!!.`val`,
            equalTo(6)
        )
    }

    @Test
    fun lowestCommonAncestor2() {
        val leftNodeLeftNode = TreeNode(0)
        val leftNodeRightNode = TreeNode(4, TreeNode(3), TreeNode(5))
        val leftNode = TreeNode(2, leftNodeLeftNode, leftNodeRightNode)
        val rightNode = TreeNode(6, TreeNode(7), TreeNode(9))
        val root = TreeNode(6, leftNode, rightNode)
        assertThat(
            Solution()
                .lowestCommonAncestor(root, TreeNode(2), TreeNode(4))!!.`val`,
            equalTo(2)
        )
    }

    @Test
    fun lowestCommonAncestor3() {
        assertThat(
            Solution()
                .lowestCommonAncestor(
                    TreeNode(2, TreeNode(1), null),
                    TreeNode(2),
                    TreeNode(1)
                )!!.`val`,
            equalTo(2)
        )
    }
}
