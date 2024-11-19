package g2301_2400.s2385_amount_of_time_for_binary_tree_to_be_infected

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun amountOfTime() {
        assertThat(
            Solution()
                .amountOfTime(
                    TreeNode.create(mutableListOf(1, 5, 3, null, 4, 10, 6, 9, 2)),
                    3,
                ),
            equalTo(4),
        )
    }

    @Test
    fun amountOfTime2() {
        assertThat(Solution().amountOfTime(TreeNode.create(mutableListOf(1)), 1), equalTo(0))
    }

    @Test
    fun amountOfTime3() {
        assertThat(
            Solution()
                .amountOfTime(
                    TreeNode.create(mutableListOf(1, 2, null, 3, null, 4, null, 5)),
                    4,
                ),
            equalTo(3),
        )
    }
}
