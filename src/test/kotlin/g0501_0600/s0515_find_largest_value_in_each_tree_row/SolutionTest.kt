package g0501_0600.s0515_find_largest_value_in_each_tree_row

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun largestValues() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 3, 2, 5, 3, null, 9))!!
        assertThat(Solution().largestValues(treeNode), equalTo(Arrays.asList(1, 3, 9)))
    }

    @Test
    fun largestValues2() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 2, 3))!!
        assertThat(Solution().largestValues(treeNode), equalTo(Arrays.asList(1, 3)))
    }
}
