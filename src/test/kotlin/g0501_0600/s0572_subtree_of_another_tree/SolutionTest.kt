package g0501_0600.s0572_subtree_of_another_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSubtree() {
        val treeNode: TreeNode = TreeNode.create(listOf(3, 4, 5, 1, 2))!!
        val subTree: TreeNode = TreeNode.create(listOf(4, 1, 2))!!
        assertThat(Solution().isSubtree(treeNode, subTree), equalTo(true))
    }

    @Test
    fun isSubtree2() {
        val treeNode: TreeNode = TreeNode.create(
            listOf(3, 4, 5, 1, 2, null, null, null, null, 0)
        )!!
        val subTree: TreeNode = TreeNode.create(listOf(4, 1, 2))!!
        assertThat(Solution().isSubtree(treeNode, subTree), equalTo(false))
    }
}
