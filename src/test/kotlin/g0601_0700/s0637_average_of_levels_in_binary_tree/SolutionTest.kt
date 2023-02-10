package g0601_0700.s0637_average_of_levels_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun averageOfLevels() {
        val treeNode: TreeNode? = TreeNode.create(listOf(3, 9, 20, null, null, 15, 7))
        assertThat(
            Solution().averageOfLevels(treeNode),
            equalTo(listOf(3.00000, 14.50000, 11.00000))
        )
    }

    @Test
    fun averageOfLevels2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(3, 9, 20, 15, 7))
        assertThat(
            Solution().averageOfLevels(treeNode),
            equalTo(listOf(3.00000, 14.50000, 11.00000))
        )
    }
}
