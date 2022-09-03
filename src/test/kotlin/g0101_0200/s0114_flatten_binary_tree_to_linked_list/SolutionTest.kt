package g0101_0200.s0114_flatten_binary_tree_to_linked_list

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flatten() {
        val tree = TreeNode.create(listOf(1, 2, 5, 3, 4, null, 6))
        val expected = TreeNode.create(listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6))
        Solution().flatten(tree)
        assertThat(tree.toString(), equalTo(expected.toString()))
    }

    @Test
    fun flatten2() {
        val tree = TreeNode.create(listOf())
        val expected = TreeNode.create(listOf())
        Solution().flatten(tree)
        assertThat(tree.toString(), equalTo(expected.toString()))
    }

    @Test
    fun flatten3() {
        val tree = TreeNode.create(listOf(0))
        val expected = TreeNode.create(listOf(0))
        Solution().flatten(tree)
        assertThat(tree.toString(), equalTo(expected.toString()))
    }
}
