package g0101_0200.s0107_binary_tree_level_order_traversal_ii

import com_github_leetcode.ArrayUtils.getLists
import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun levelOrderBottom() {
        val root: TreeNode? = TreeNode.create(Arrays.asList(3, 9, 20, null, null, 15, 7))
        assertThat(
            Solution().levelOrderBottom(root),
            equalTo(getLists(arrayOf(intArrayOf(15, 7), intArrayOf(9, 20), intArrayOf(3))))
        )
    }

    @Test
    fun levelOrderBottom2() {
        val root: TreeNode? = TreeNode.create(Arrays.asList(1))
        assertThat(
            Solution().levelOrderBottom(root),
            equalTo(getLists(arrayOf(intArrayOf(1))))
        )
    }

    @Test
    fun levelOrderBottom3() {
        assertThat(
            Solution().levelOrderBottom(null),
            equalTo(getLists(arrayOf<IntArray>()))
        )
    }
}
