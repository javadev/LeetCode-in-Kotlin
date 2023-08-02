package g1301_1400.s1302_deepest_leaves_sum

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deepestLeavesSum() {
        val treeNode = TreeNode.create(mutableListOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8))
        assertThat(Solution().deepestLeavesSum(treeNode), equalTo(15))
    }

    @Test
    fun deepestLeavesSum2() {
        val treeNode = TreeNode.create(mutableListOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5))
        assertThat(Solution().deepestLeavesSum(treeNode), equalTo(19))
    }
}
