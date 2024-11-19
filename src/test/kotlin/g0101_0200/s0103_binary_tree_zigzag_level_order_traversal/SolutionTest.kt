package g0101_0200.s0103_binary_tree_zigzag_level_order_traversal

import com_github_leetcode.ArrayUtils.getLists
import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun zigzagLevelOrder() {
        val root: TreeNode = TreeNode.create(arrayListOf(3, 9, 20, null, null, 15, 7))!!
        assertThat(
            Solution().zigzagLevelOrder(root),
            equalTo(getLists(arrayOf(intArrayOf(3), intArrayOf(20, 9), intArrayOf(15, 7)))),
        )
    }

    @Test
    fun zigzagLevelOrder2() {
        val root: TreeNode = TreeNode.create(arrayListOf(1))!!
        assertThat(
            Solution().zigzagLevelOrder(root),
            equalTo(getLists(arrayOf(intArrayOf(1)))),
        )
    }

    @Test
    fun zigzagLevelOrder3() {
        assertThat(
            Solution().zigzagLevelOrder(null),
            equalTo(getLists(arrayOf<IntArray>())),
        )
    }
}
