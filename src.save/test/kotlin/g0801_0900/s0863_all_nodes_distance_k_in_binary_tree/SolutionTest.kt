package g0801_0900.s0863_all_nodes_distance_k_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distanceK() {
        assertThat(
            Solution()
                .distanceK(
                    TreeNode.create(
                        listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
                    ),
                    TreeNode(5),
                    2
                ),
            equalTo(listOf(7, 4, 1))
        )
    }

    @Test
    fun distanceK2() {
        assertThat(
            Solution()
                .distanceK(
                    TreeNode.create(listOf(1)),
                    TreeNode(1),
                    3
                ),
            equalTo(emptyList())
        )
    }
}
