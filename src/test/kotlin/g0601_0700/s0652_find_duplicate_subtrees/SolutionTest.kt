package g0601_0700.s0652_find_duplicate_subtrees

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDuplicateSubtrees() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 2, 3, 4, null, 2, 4, null, null, 4))
        val item1: TreeNode? = TreeNode.create(listOf(2, 4))
        val item2: TreeNode? = TreeNode.create(listOf(4))
        val expected: List<TreeNode?> = listOf(item2, item1)
        assertThat(
            Solution().findDuplicateSubtrees(treeNode).toString(),
            equalTo(expected.toString()),
        )
    }

    @Test
    fun findDuplicateSubtrees2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(2, 2, 2, 3, null, 3, null))
        val item1: TreeNode? = TreeNode.create(listOf(2, 3))
        val item2: TreeNode? = TreeNode.create(listOf(3))
        val expected: List<TreeNode?> = listOf(item2, item1)
        assertThat(
            Solution().findDuplicateSubtrees(treeNode).toString(),
            equalTo(expected.toString()),
        )
    }
}
