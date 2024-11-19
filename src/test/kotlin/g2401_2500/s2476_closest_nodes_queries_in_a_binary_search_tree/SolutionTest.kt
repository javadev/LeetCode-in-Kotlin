package g2401_2500.s2476_closest_nodes_queries_in_a_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestNodes() {
        assertThat(
            Solution()
                .closestNodes(
                    TreeNode.create(
                        mutableListOf(
                            6, 2, 13, 1, 4, 9, 15, null, null, null, null, null,
                            null, 14,
                        ),
                    ),
                    mutableListOf(2, 5, 16),
                ),
            equalTo(
                listOf(mutableListOf(2, 2), mutableListOf(4, 6), listOf(15, -1)),
            ),
        )
    }

    @Test
    fun closestNodes2() {
        assertThat(
            Solution()
                .closestNodes(
                    TreeNode.create(mutableListOf(4, null, 9)),
                    listOf(3),
                ),
            equalTo(listOf(listOf(-1, 4))),
        )
    }
}
