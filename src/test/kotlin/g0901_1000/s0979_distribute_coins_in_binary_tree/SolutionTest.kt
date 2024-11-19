package g0901_1000.s0979_distribute_coins_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCoins() {
        assertThat(
            Solution()
                .distributeCoins(TreeNode.create(listOf(3, 0, 0))),
            equalTo(2),
        )
    }

    @Test
    fun distributeCoins2() {
        assertThat(
            Solution()
                .distributeCoins(TreeNode.create(listOf(0, 3, 0))),
            equalTo(3),
        )
    }

    @Test
    fun distributeCoins3() {
        assertThat(
            Solution()
                .distributeCoins(
                    TreeNode.create(listOf(1, 0, 0, null, 3)),
                ),
            equalTo(4),
        )
    }
}
