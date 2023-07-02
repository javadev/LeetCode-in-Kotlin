package g0101_0200.s0111_minimum_depth_of_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDepth() {
        val root: TreeNode? = TreeNode.create(listOf(3, 9, 20, null, null, 15, 7))
        assertThat(Solution().minDepth(root), equalTo(2))
    }

    @Test
    fun minDepth2() {
        val root: TreeNode? = TreeNode.create(listOf(2, null, 3, null, 4, null, 5, null, 6))
        assertThat(Solution().minDepth(root), equalTo(5))
    }
}
