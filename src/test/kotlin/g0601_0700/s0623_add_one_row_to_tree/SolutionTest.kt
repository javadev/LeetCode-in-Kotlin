package g0601_0700.s0623_add_one_row_to_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addOneRow() {
        val treeNode: TreeNode = TreeNode.create(listOf(4, 2, 6, 3, 1, 5))!!
        val expected: TreeNode = TreeNode.create(listOf(4, 1, 1, 2, null, null, 6, 3, 1, 5))!!
        assertThat(
            Solution().addOneRow(treeNode, 1, 2).toString(),
            equalTo(expected.toString()),
        )
    }

    @Test
    fun addOneRow2() {
        val treeNode: TreeNode = TreeNode.create(listOf(4, 2, null, 3, 1))!!
        val expected: TreeNode = TreeNode.create(listOf(4, 2, null, 1, 1, 3, null, null, 1))!!
        assertThat(
            Solution().addOneRow(treeNode, 1, 3).toString(),
            equalTo(expected.toString()),
        )
    }
}
