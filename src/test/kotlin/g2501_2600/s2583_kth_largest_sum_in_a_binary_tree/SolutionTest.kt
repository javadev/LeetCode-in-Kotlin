package g2501_2600.s2583_kth_largest_sum_in_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthLargestLevelSum() {
        assertThat(
            Solution().kthLargestLevelSum(
                TreeNode.create(
                    listOf(5, 8, 9, 2, 1, 3, 7, 4, 6)
                ),
                2
            ),
            equalTo(13)
        )
    }

    @Test
    fun kthLargestLevelSum2() {
        assertThat(
            Solution().kthLargestLevelSum(
                TreeNode.create(
                    listOf(1, 2, null, 3)
                ),
                1
            ),
            equalTo(3)
        )
    }
}
