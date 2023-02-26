package g0601_0700.s0654_maximum_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructMaximumBinaryTree() {
        val expected = TreeNode.create(listOf(6, 3, 5, null, 2, 0, null, null, 1))
        assertThat(
            Solution().constructMaximumBinaryTree(intArrayOf(3, 2, 1, 6, 0, 5)).toString(),
            equalTo(expected.toString())
        )
    }

    @Test
    fun constructMaximumBinaryTree2() {
        val expected = TreeNode.create(listOf(3, null, 2, null, 1))
        assertThat(
            Solution().constructMaximumBinaryTree(intArrayOf(3, 2, 1)).toString(),
            equalTo(expected.toString())
        )
    }
}
