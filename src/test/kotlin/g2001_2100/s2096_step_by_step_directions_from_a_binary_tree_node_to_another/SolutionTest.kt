package g2001_2100.s2096_step_by_step_directions_from_a_binary_tree_node_to_another

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun directions() {
        assertThat(
            Solution()
                .getDirections(
                    TreeNode.create(listOf(5, 1, 2, 3, null, 6, 4)),
                    3,
                    6,
                ),
            equalTo("UURL"),
        )
    }

    @Test
    fun directions2() {
        assertThat(
            Solution().getDirections(TreeNode.create(listOf(2, 1)), 2, 1),
            equalTo("L"),
        )
    }
}
