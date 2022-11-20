package g0101_0200.s0112_path_sum

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasPathSum() {
        val root: TreeNode? = TreeNode.create(
            listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1)
        )
        assertThat(Solution().hasPathSum(root, 22), equalTo(true))
    }

    @Test
    fun hasPathSum2() {
        val root: TreeNode? = TreeNode.create(listOf(1, 2, 3))
        assertThat(Solution().hasPathSum(root, 22), equalTo(false))
    }

    @Test
    fun hasPathSum3() {
        assertThat(Solution().hasPathSum(null, 0), equalTo(false))
    }
}
