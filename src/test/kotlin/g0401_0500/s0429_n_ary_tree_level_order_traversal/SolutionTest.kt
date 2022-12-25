package g0401_0500.s0429_n_ary_tree_level_order_traversal

import com_github_leetcode.Node
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun levelOrder() {
        var node3: Node
        val node2 = Node(2)
        val node4 = Node(4)
        val node5 = Node(5)
        val node6 = Node(6)
        node3 = Node(3, listOf(node5, node6))
        val root = Node(1, listOf(node3, node2, node4))
        val expected: MutableList<List<Int>> = ArrayList()
        expected.add(listOf(1))
        expected.add(listOf(3, 2, 4))
        expected.add(listOf(5, 6))
        assertThat(Solution().levelOrder(root).toString(), equalTo(expected.toString()))
    }
}
