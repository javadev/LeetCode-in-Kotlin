package g0001_0100.s0094_binary_tree_inorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun inorderTraversal() {
        var tree = TreeNode(1)
        tree.left = null
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        assertThat(Solution().inorderTraversal(tree), equalTo(arrayListOf(1, 3, 2)))
    }

    @Test
    fun inorderTraversal2() {
        var tree = null
        assertThat(Solution().inorderTraversal(tree), equalTo(arrayListOf()))
    }

    @Test
    fun inorderTraversal3() {
        var tree = TreeNode(1)
        assertThat(Solution().inorderTraversal(tree), equalTo(arrayListOf(1)))
    }
}
