package g0501_0600.s0501_find_mode_in_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMode() {
        val treeNode = TreeNode(1)
        treeNode.right = TreeNode(2)
        treeNode.right!!.left = TreeNode(2)
        val expected = intArrayOf(2)
        assertThat(Solution().findMode(treeNode), equalTo(expected))
    }

    @Test
    fun findMode2() {
        val treeNode = TreeNode(0)
        val expected = intArrayOf(0)
        assertThat(Solution().findMode(treeNode), equalTo(expected))
    }
}
