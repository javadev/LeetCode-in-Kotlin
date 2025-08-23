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

    @Test
    fun levelOrder2() {
        val root = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        val node5 = Node(5)
        root.neighbors = listOf(node2, node3, node4, node5)
        val node6 = Node(6)
        val node7 = Node(7)
        node3.neighbors = listOf(node6, node7)
        val node11 = Node(11)
        node7.neighbors = listOf(node11)
        val node14 = Node(14)
        node11.neighbors = listOf(node14)
        val node8 = Node(8)
        node4.neighbors = listOf(node8)
        val node12 = Node(12)
        node8.neighbors = listOf(node12)
        val node9 = Node(9)
        val node10 = Node(10)
        node5.neighbors = listOf(node9, node10)
        val node13 = Node(13)
        node9.neighbors = listOf(node13)
        val expected = mutableListOf<MutableList<Int>>()
        expected.add(mutableListOf<Int>(1))
        expected.add(mutableListOf<Int>(2, 3, 4, 5))
        expected.add(mutableListOf<Int>(6, 7, 8, 9, 10))
        expected.add(mutableListOf<Int>(11, 12, 13))
        expected.add(mutableListOf<Int>(14))
        assertThat(Solution().levelOrder(root).toString(), equalTo(expected.toString()))
    }
}
