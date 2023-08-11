package g0101_0200.s0199_binary_tree_right_side_view

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rightSideView() {
        val left = TreeNode(2, null, TreeNode(5))
        val right = TreeNode(3, null, TreeNode(4))
        val root = TreeNode(1, left, right)
        assertThat(Solution().rightSideView(root), equalTo(listOf(1, 3, 4)))
    }

    @Test
    fun rightSideView2() {
        val root = TreeNode(1, null, TreeNode(3))
        assertThat(Solution().rightSideView(root), equalTo(listOf(1, 3)))
    }
}
