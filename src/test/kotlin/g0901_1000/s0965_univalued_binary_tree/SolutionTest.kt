package g0901_1000.s0965_univalued_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isUnivalTree() {
        assertThat(
            Solution().isUnivalTree(TreeNode.create(listOf(1, 1, 1, 1, 1, null, 1))),
            equalTo(true)
        )
    }

    @Test
    fun isUnivalTree2() {
        assertThat(
            Solution().isUnivalTree(TreeNode.create(listOf(2, 2, 2, 5, 2))),
            equalTo(false)
        )
    }
}
