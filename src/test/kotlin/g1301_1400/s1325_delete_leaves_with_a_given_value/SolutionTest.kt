package g1301_1400.s1325_delete_leaves_with_a_given_value

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeLeafNodes() {
        val treeNode = TreeNode.create(mutableListOf(1, 2, 3, 2, null, 2, 4))
        val expected = TreeNode.create(mutableListOf(1, null, 3, null, 4))
        assertThat(
            Solution().removeLeafNodes(treeNode, 2).toString(),
            equalTo(expected.toString())
        )
    }

    @Test
    fun removeLeafNodes2() {
        val treeNode = TreeNode.create(mutableListOf(1, 3, 3, 3, 2))
        val expected = TreeNode.create(mutableListOf(1, 3, null, null, 2))
        assertThat(
            Solution().removeLeafNodes(treeNode, 3).toString(),
            equalTo(expected.toString())
        )
    }

    @Test
    fun removeLeafNodes3() {
        val treeNode = TreeNode.create(mutableListOf(1, 2, null, 2, null, 2))
        val expected = TreeNode.create(listOf(1))
        assertThat(
            Solution().removeLeafNodes(treeNode, 2).toString(),
            equalTo(expected.toString())
        )
    }
}
