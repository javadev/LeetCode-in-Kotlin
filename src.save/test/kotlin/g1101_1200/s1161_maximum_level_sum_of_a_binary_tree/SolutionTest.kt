package g1101_1200.s1161_maximum_level_sum_of_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxLevelSum() {
        val root = TreeNode.create(listOf(1, 7, 0, 7, -8, null, null))
        assertThat(Solution().maxLevelSum(root), equalTo(2))
    }

    @Test
    fun maxLevelSum2() {
        val root = TreeNode.create(
            listOf(989, null, 10250, 98693, -89388, null, null, null, -32127)
        )
        assertThat(Solution().maxLevelSum(root), equalTo(2))
    }
}
