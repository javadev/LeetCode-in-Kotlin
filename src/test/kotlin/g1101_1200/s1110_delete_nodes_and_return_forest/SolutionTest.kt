package g1101_1200.s1110_delete_nodes_and_return_forest

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun delNodes() {
        val root = TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6, 7))
        assertThat(
            Solution().delNodes(root, intArrayOf(3, 5)).toString(),
            equalTo(
                listOf(
                    TreeNode.create(mutableListOf(1, 2, null, 4)),
                    TreeNode.create(listOf(6)),
                    TreeNode.create(listOf(7)),
                )
                    .toString(),
            ),
        )
    }

    @Test
    fun delNodes2() {
        val root = TreeNode.create(mutableListOf(1, 2, 4, null, 3))
        assertThat(
            Solution().delNodes(root, intArrayOf(3)).toString(),
            equalTo(
                listOf(TreeNode.create(mutableListOf(1, 2, 4))).toString(),
            ),
        )
    }
}
