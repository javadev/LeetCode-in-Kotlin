package g0001_0100.s0098_validate_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValidBST() {
        assertThat(Solution().isValidBST(TreeNode.create(listOf(2, 1, 3))), equalTo(true))
    }

    @Test
    fun isValidBST2() {
        assertThat(Solution().isValidBST(TreeNode.create(listOf(5, 1, 4, null, null, 3, 6))), equalTo(false))
    }
}
