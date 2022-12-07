package g0401_0500.s0404_sum_of_left_leaves

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfLeftLeaves() {
        assertThat(
            Solution()
                .sumOfLeftLeaves(
                    TreeNode.create(listOf(3, 9, 20, null, null, 15, 7))!!
                ),
            equalTo(24)
        )
    }

    @Test
    fun sumOfLeftLeaves2() {
        assertThat(Solution().sumOfLeftLeaves(TreeNode.create(listOf(1))!!), equalTo(0))
    }
}
