package g0601_0700.s0700_search_in_a_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun searchBST() {
        val root: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3))
        val expected: TreeNode? = TreeNode.create(listOf(2, 1, 3))
        assertThat(Solution().searchBST(root, 2).toString(), equalTo(expected.toString()))
    }

    @Test
    fun searchBST2() {
        val root: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3))
        assertThat(Solution().searchBST(root, 5), equalTo(null))
    }
}
