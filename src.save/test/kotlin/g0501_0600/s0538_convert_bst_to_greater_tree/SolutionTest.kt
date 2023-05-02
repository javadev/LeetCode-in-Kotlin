package g0501_0600.s0538_convert_bst_to_greater_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertBST() {
        val treeNode: TreeNode = TreeNode.create(
            listOf(
                4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8
            )
        )!!
        val expected: TreeNode = TreeNode.create(
            listOf(
                30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null,
                8
            )
        )!!
        assertThat(Solution().convertBST(treeNode).toString(), equalTo(expected.toString()))
    }

    @Test
    fun convertBST2() {
        val treeNode: TreeNode = TreeNode.create(listOf(0, null, 1))!!
        val expected: TreeNode = TreeNode.create(listOf(1, null, 1))!!
        assertThat(Solution().convertBST(treeNode).toString(), equalTo(expected.toString()))
    }
}
