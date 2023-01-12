package g0501_0600.s0513_find_bottom_left_tree_value

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findBottomLeftValue() {
        val treeNode: TreeNode = TreeNode.create(listOf(2, 1, 3))!!
        assertThat(Solution().findBottomLeftValue(treeNode), equalTo(1))
    }

    @Test
    fun findBottomLeftValue2() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 2, 3, 4, null, 5, 6, null, null, 7))!!
        assertThat(Solution().findBottomLeftValue(treeNode), equalTo(7))
    }
}
