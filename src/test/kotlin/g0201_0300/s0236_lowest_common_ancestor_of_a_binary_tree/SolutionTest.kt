package g0201_0300.s0236_lowest_common_ancestor_of_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lowestCommonAncestor() {
        val leftNodeLeftNode = TreeNode(6)
        val leftNodeRightNode = TreeNode(2, TreeNode(7), TreeNode(4))
        val leftNode = TreeNode(5, leftNodeLeftNode, leftNodeRightNode)
        val rightNode = TreeNode(1, TreeNode(0), TreeNode(8))
        val root = TreeNode(3, leftNode, rightNode)
        assertThat(
            Solution().lowestCommonAncestor(root, TreeNode(5), TreeNode(1))!!.`val`,
            equalTo(3)
        )
    }

    @Test
    fun lowestCommonAncestor2() {
        val leftNodeLeftNode = TreeNode(6)
        val leftNodeRightNode = TreeNode(2, TreeNode(7), TreeNode(4))
        val leftNode = TreeNode(5, leftNodeLeftNode, leftNodeRightNode)
        val rightNode = TreeNode(1, TreeNode(0), TreeNode(8))
        val root = TreeNode(3, leftNode, rightNode)
        assertThat(
            Solution().lowestCommonAncestor(root, TreeNode(5), TreeNode(4))!!.`val`,
            equalTo(5)
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
