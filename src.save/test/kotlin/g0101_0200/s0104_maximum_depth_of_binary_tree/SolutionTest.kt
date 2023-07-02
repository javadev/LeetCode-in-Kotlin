package g0101_0200.s0104_maximum_depth_of_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDepth() {
        assertThat(Solution().maxDepth(TreeNode.create(listOf(3, 9, 20, null, null, 15, 7))), equalTo(3))
    }

    @Test
    fun maxDepth2() {
        assertThat(Solution().maxDepth(TreeNode.create(listOf(1, null, 2))), equalTo(2))
    }
}
