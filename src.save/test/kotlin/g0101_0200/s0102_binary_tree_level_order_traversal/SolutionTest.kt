package g0101_0200.s0102_binary_tree_level_order_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun levelOrder() {
        assertThat(
            Solution().levelOrder(TreeNode.create(listOf(3, 9, 20, null, null, 15, 7))),
            equalTo(listOf(listOf(3), listOf(9, 20), listOf(15, 7)))
        )
    }

    @Test
    fun levelOrder2() {
        assertThat(Solution().levelOrder(TreeNode.create(listOf(1))), equalTo(listOf(listOf(1))))
    }

    @Test
    fun levelOrder3() {
        assertThat(Solution().levelOrder(TreeNode.create(listOf())), equalTo(listOf()))
    }
}
