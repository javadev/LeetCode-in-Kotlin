package g0501_0600.s0530_minimum_absolute_difference_in_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getMinimumDifference() {
        val treeNode: TreeNode = TreeNode.create(listOf(4, 2, 6, 1, 3))!!
        assertThat(Solution().getMinimumDifference(treeNode), equalTo(1))
    }

    @Test
    fun getMinimumDifference2() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 0, 48, null, null, 12, 49))!!
        assertThat(Solution().getMinimumDifference(treeNode), equalTo(1))
    }
}
