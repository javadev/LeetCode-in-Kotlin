package g0701_0800.s0701_insert_into_a_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun insertIntoBST() {
        val treeNode: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3))
        val expected: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3, 5))
        assertThat(
            Solution().insertIntoBST(treeNode, 5).toString(),
            equalTo(expected.toString()),
        )
    }

    @Test
    fun insertIntoBST2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(40, 20, 60, 10, 30, 50, 70))
        val expected: TreeNode? = TreeNode.create(listOf(40, 20, 60, 10, 30, 50, 70, null, null, 25))
        assertThat(
            Solution().insertIntoBST(treeNode, 25).toString(),
            equalTo(expected.toString()),
        )
    }

    @Test
    fun insertIntoBST3() {
        val treeNode: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3, null, null, null, null, null, null))
        val expected: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3, 5))
        assertThat(
            Solution().insertIntoBST(treeNode, 5).toString(),
            equalTo(expected.toString()),
        )
    }
}
