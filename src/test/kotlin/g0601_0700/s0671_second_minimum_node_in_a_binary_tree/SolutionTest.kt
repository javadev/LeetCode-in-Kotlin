package g0601_0700.s0671_second_minimum_node_in_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSecondMinimumValue() {
        val treeNode: TreeNode? = TreeNode.create(listOf(2, 2, 5, null, null, 5, 7))
        assertThat(Solution().findSecondMinimumValue(treeNode), equalTo(5))
    }

    @Test
    fun findSecondMinimumValue2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(2, 2, 2))
        assertThat(Solution().findSecondMinimumValue(treeNode), equalTo(-1))
    }
}
