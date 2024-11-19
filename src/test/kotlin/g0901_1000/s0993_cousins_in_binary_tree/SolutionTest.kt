package g0901_1000.s0993_cousins_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isCousins() {
        assertThat(
            Solution()
                .isCousins(TreeNode.create(listOf(1, 2, 3, 4)), 4, 3),
            equalTo(false),
        )
    }

    @Test
    fun isCousins2() {
        assertThat(
            Solution()
                .isCousins(
                    TreeNode.create(
                        listOf(1, 2, 3, null, 4, null, 5),
                    ),
                    5,
                    4,
                ),
            equalTo(true),
        )
    }

    @Test
    fun isCousins3() {
        assertThat(
            Solution()
                .isCousins(
                    TreeNode.create(listOf(1, 2, 3, null, 4)),
                    2,
                    3,
                ),
            equalTo(false),
        )
    }
}
