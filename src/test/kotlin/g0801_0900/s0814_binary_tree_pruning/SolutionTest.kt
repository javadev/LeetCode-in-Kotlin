package g0801_0900.s0814_binary_tree_pruning

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pruneTree() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, null, 0, 0, 1))
        val expected: TreeNode? = TreeNode.create(listOf(1, null, 0, null, 1))
        assertThat(Solution().pruneTree(treeNode).toString(), equalTo(expected.toString()))
    }

    @Test
    fun pruneTree2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 0, 1, 0, 0, 0, 1))
        val expected: TreeNode? = TreeNode.create(listOf(1, null, 1, null, 1))
        assertThat(Solution().pruneTree(treeNode).toString(), equalTo(expected.toString()))
    }

    @Test
    fun pruneTree3() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 1, 0, 1, 1, 0, 1, 0))
        val expected: TreeNode? = TreeNode.create(listOf(1, 1, 0, 1, 1, null, 1))
        assertThat(Solution().pruneTree(treeNode).toString(), equalTo(expected.toString()))
    }
}
