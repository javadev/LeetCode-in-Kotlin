package g0501_0600.s0543_diameter_of_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diameterOfBinaryTree() {
        assertThat(
            Solution().diameterOfBinaryTree(TreeNode.create(listOf(1, 2, 3, 4, 5))),
            equalTo(3)
        )
    }

    @Test
    fun diameterOfBinaryTree2() {
        assertThat(
            Solution().diameterOfBinaryTree(TreeNode.create(listOf(1, 2))),
            equalTo(1)
        )
    }
}
