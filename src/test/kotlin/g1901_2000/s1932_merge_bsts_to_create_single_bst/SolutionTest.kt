package g1901_2000.s1932_merge_bsts_to_create_single_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMerge() {
        val nodes: List<TreeNode> = listOf(
            TreeNode.create(mutableListOf(2, 1))!!,
            TreeNode.create(mutableListOf(3, 2, 5))!!,
            TreeNode.create(mutableListOf(5, 4))!!,
        )
        assertThat(
            Solution().canMerge(nodes).toString(),
            equalTo(TreeNode.create(mutableListOf(3, 2, 5, 1, null, 4)).toString()),
        )
    }

    @Test
    fun canMerge2() {
        val nodes: List<TreeNode> = listOf(
            TreeNode.create(mutableListOf(5, 3, 8))!!,
            TreeNode.create(mutableListOf(3, 2, 6))!!,
        )
        assertThat(
            Solution().canMerge(nodes),
            equalTo(TreeNode.create(emptyList())),
        )
    }

    @Test
    fun canMerge3() {
        val nodes: List<TreeNode> = listOf(
            TreeNode.create(mutableListOf(5, 4))!!,
            TreeNode.create(mutableListOf(3))!!,
        )
        assertThat(
            Solution().canMerge(nodes),
            equalTo(TreeNode.create(emptyList())),
        )
    }
}
