package g0101_0200.s0145_binary_tree_postorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun postorderTraversal() {
        val treeNode = TreeNode(1)
        treeNode.right = TreeNode(2)
        treeNode.right!!.left = TreeNode(3)
        assertThat(Solution().postorderTraversal(treeNode), equalTo(listOf(3, 2, 1)))
    }

    @Test
    fun postorderTraversal2() {
        assertThat(Solution().postorderTraversal(null), equalTo(emptyList()))
    }

    @Test
    fun postorderTraversal3() {
        assertThat(
            Solution().postorderTraversal(TreeNode(1)),
            equalTo(listOf(1)),
        )
    }
}
