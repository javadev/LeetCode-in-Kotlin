package g0601_0700.s0653_two_sum_iv_input_is_a_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTarget() {
        val treeNode: TreeNode? = TreeNode.create(listOf(5, 3, 6, 2, 4, null, 7))
        assertThat(Solution().findTarget(treeNode, 9), equalTo(true))
    }

    @Test
    fun findTarget2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(5, 3, 6, 2, 4, null, 7))
        assertThat(Solution().findTarget(treeNode, 28), equalTo(false))
    }
}
