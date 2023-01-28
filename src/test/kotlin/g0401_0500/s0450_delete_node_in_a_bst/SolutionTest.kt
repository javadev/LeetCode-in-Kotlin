package g0401_0500.s0450_delete_node_in_a_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteNode() {
        val input: TreeNode? = TreeNode.create(listOf(5, 3, 6, 2, 4, null, 7))
        val expected: TreeNode? = TreeNode.create(listOf(5, 4, 6, 2, null, null, 7))
        assertThat(Solution().deleteNode(input, 3).toString(), equalTo(expected.toString()))
    }

    @Test
    fun deleteNode2() {
        val input: TreeNode? = TreeNode.create(listOf(5, 3, 6, 2, 4, null, 7))
        val expected: TreeNode? = TreeNode.create(listOf(5, 3, 6, 2, 4, null, 7))
        assertThat(Solution().deleteNode(input, 0).toString(), equalTo(expected.toString()))
    }

    @Test
    fun deleteNode3() {
        assertThat(Solution().deleteNode(null, 0), equalTo(null))
    }
}
