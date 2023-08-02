package g2601_2700.s2641_cousins_in_binary_tree_ii

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun replaceValueInTree() {
        assertThat(
            Solution().replaceValueInTree(TreeNode.create(listOf(5, 4, 9, 1, 10, null, 7))).toString(),
            equalTo(
                TreeNode.create(listOf(0, 0, 0, 7, 7, null, 11)).toString()
            )
        )
    }

    @Test
    fun replaceValueInTree2() {
        assertThat(
            Solution().replaceValueInTree(TreeNode.create(listOf(3, 1, 2))).toString(),
            equalTo(
                TreeNode.create(listOf(0, 0, 0)).toString()
            )
        )
    }
}
