package g0101_0200.s0110_balanced_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun balancedBinaryTree() {
        val root: TreeNode? = TreeNode.create(listOf(3, 9, 20, null, null, 15, 7))
        assertThat(Solution().isBalanced(root), equalTo(true))
    }

    @Test
    fun balancedBinaryTree2() {
        val root: TreeNode? = TreeNode.create(listOf(1, 2, 2, 3, 3, null, null, 4, 4))
        assertThat(Solution().isBalanced(root), equalTo(false))
    }

    @Test
    fun balancedBinaryTree3() {
        assertThat(Solution().isBalanced(null), equalTo(true))
    }
}
