package g0301_0400.s0337_house_robber_iii

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rob() {
        val root = TreeNode(
            3,
            TreeNode(2, null, TreeNode(3)),
            TreeNode(3, null, TreeNode(1))
        )
        assertThat(Solution().rob(root), equalTo(7))
    }

    @Test
    fun rob2() {
        val root = TreeNode(
            3,
            TreeNode(4, TreeNode(1), TreeNode(3)),
            TreeNode(5, null, TreeNode(1))
        )
        assertThat(Solution().rob(root), equalTo(9))
    }
}
