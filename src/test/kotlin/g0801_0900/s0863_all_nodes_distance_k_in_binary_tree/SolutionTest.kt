package g0801_0900.s0863_all_nodes_distance_k_in_binary_tree

import com_github_leetcode.TreeNode
import com_github_leetcode.TreeUtils
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
                        listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4),
                    ),
                    TreeNode(5),
                    2,
                ),
            equalTo(listOf(7, 4, 1)),
        )
    }

    @Test
    fun distanceK2() {
        assertThat(
            Solution()
                .distanceK(
                    TreeNode.create(listOf(1)),
                    TreeNode(1),
                    3,
                ),
            equalTo(emptyList()),
        )
    }

    @Test
    fun distanceK3() {
        val root = TreeUtils.constructBinaryTree(
            listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4),
        )
        assertThat(
            Solution().distanceK(root, TreeNode(3), 2),
            equalTo(listOf(6, 2, 0, 8)),
        )
    }

    @Test
    fun distanceK4() {
        val root = TreeUtils.constructBinaryTree(
            listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4),
        )
        assertThat(
            Solution().distanceK(root, TreeNode(7), 1),
            equalTo(listOf(2)),
        )
    }

    @Test
    fun distanceK5() {
        val root = TreeUtils.constructBinaryTree(listOf(1, 2, 3))
        assertThat(
            Solution().distanceK(root, TreeNode(2), 0),
            equalTo(listOf(2)),
        )
    }

    @Test
    fun distanceK6() {
        val root = TreeUtils.constructBinaryTree(listOf(1, 2, 3))
        assertThat(
            Solution().distanceK(root, TreeNode(1), 5),
            equalTo(emptyList<Int>()),
        )
    }

    @Test
    fun distanceK7() {
        val root = TreeUtils.constructBinaryTree(listOf(1, 2, null, 3, null, 4))
        assertThat(
            Solution().distanceK(root, TreeNode(2), 2),
            equalTo(listOf(4)),
        )
    }
}
