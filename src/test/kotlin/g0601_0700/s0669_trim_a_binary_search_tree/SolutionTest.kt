package g0601_0700.s0669_trim_a_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun trimBST() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 0, 2))
        val expected: TreeNode? = TreeNode.create(listOf(1, null, 2))
        assertThat(Solution().trimBST(treeNode, 1, 2).toString(), equalTo(expected.toString()))
    }

    @Test
    fun trimBST2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(3, 0, 4, null, 2, null, null, 1))
        val expected: TreeNode? = TreeNode.create(listOf(3, 2, null, 1))
        assertThat(Solution().trimBST(treeNode, 1, 3).toString(), equalTo(expected.toString()))
    }
}
