package g0201_0300.s0222_count_complete_tree_nodes

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNodes() {
        val leftNodeLeftNode = TreeNode(4)
        val leftNodeRightNode = TreeNode(5)
        val leftNode = TreeNode(2, leftNodeLeftNode, leftNodeRightNode)
        val rightNodeLeftNode = TreeNode(6)
        val rightNode = TreeNode(3, rightNodeLeftNode, null)
        val root = TreeNode(1, leftNode, rightNode)
        assertThat(Solution().countNodes(root), equalTo(6))
    }

    @Test
    fun countNodes2() {
        assertThat(Solution().countNodes(null), equalTo(0))
    }

    @Test
    fun countNodes3() {
        assertThat(Solution().countNodes(TreeNode(1)), equalTo(1))
    }
}
