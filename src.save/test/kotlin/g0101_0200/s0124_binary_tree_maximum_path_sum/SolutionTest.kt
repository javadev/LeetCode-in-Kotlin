package g0101_0200.s0124_binary_tree_maximum_path_sum

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPathSum() {
        assertThat(Solution().maxPathSum(TreeNode.create(listOf(1, 2, 3))), equalTo(6))
    }

    @Test
    fun maxPathSum2() {
        assertThat(Solution().maxPathSum(TreeNode.create(listOf(-10, 9, 20, null, null, 15, 7))), equalTo(42))
    }
}
