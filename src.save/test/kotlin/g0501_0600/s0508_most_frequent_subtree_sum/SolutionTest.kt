package g0501_0600.s0508_most_frequent_subtree_sum

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findFrequentTreeSum() {
        val treeNode: TreeNode = TreeNode.create(listOf(5, 2, -3))!!
        val expected = intArrayOf(2, -3, 4)
        assertThat(Solution().findFrequentTreeSum(treeNode), equalTo(expected))
    }

    @Test
    fun findFrequentTreeSum2() {
        val treeNode: TreeNode = TreeNode.create(listOf(5, 2, -5))!!
        val expected = intArrayOf(2)
        assertThat(Solution().findFrequentTreeSum(treeNode), equalTo(expected))
    }
}
