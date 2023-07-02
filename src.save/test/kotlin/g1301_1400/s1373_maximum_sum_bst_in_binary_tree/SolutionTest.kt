package g1301_1400.s1373_maximum_sum_bst_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumBST() {
        val treeNode = TreeNode.create(
            mutableListOf(
                1, 4, 3, 2, 4, 2, 5, null, null, null, null, null, null, 4, 6
            )
        )
        assertThat(Solution().maxSumBST(treeNode), equalTo(20))
    }

    @Test
    fun maxSumBST2() {
        val treeNode = TreeNode.create(mutableListOf(4, 3, null, 1, 2))
        assertThat(Solution().maxSumBST(treeNode), equalTo(2))
    }

    @Test
    fun maxSumBST3() {
        val treeNode = TreeNode.create(listOf(-4, -2, -5))
        assertThat(Solution().maxSumBST(treeNode), equalTo(0))
    }
}
