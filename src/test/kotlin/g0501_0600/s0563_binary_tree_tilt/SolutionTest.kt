package g0501_0600.s0563_binary_tree_tilt

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTilt() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 2, 3))!!
        assertThat(Solution().findTilt(treeNode), equalTo(1))
    }

    @Test
    fun findTilt2() {
        val treeNode: TreeNode = TreeNode.create(listOf(4, 2, 9, 3, 5, null, 7))!!
        assertThat(Solution().findTilt(treeNode), equalTo(15))
    }

    @Test
    fun findTilt3() {
        val treeNode: TreeNode = TreeNode.create(listOf(21, 7, 14, 1, 1, 2, 2, 3, 3))!!
        assertThat(Solution().findTilt(treeNode), equalTo(9))
    }
}
