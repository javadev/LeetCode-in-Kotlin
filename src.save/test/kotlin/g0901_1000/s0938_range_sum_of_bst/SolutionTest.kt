package g0901_1000.s0938_range_sum_of_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rangeSumBST() {
        val treeNode: TreeNode? = TreeNode.create(listOf(10, 5, 15, 3, 7, null, 18))
        assertThat(Solution().rangeSumBST(treeNode, 7, 15), equalTo(32))
    }

    @Test
    fun rangeSumBST2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6))
        assertThat(Solution().rangeSumBST(treeNode, 6, 10), equalTo(23))
    }
}
