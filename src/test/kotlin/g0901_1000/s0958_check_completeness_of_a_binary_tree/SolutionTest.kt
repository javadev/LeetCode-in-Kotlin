package g0901_1000.s0958_check_completeness_of_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isCompleteTree() {
        assertThat(
            Solution().isCompleteTree(TreeNode.create(listOf(1, 2, 3, 4, 5, 6))),
            equalTo(true)
        )
    }

    @Test
    fun isCompleteTree2() {
        assertThat(
            Solution()
                .isCompleteTree(TreeNode.create(listOf(1, 2, 3, 4, 5, null, 7))),
            equalTo(false)
        )
    }
}
