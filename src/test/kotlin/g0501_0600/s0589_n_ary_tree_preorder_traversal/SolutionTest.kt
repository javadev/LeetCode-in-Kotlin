package g0501_0600.s0589_n_ary_tree_preorder_traversal

import com_github_leetcode.Node
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun preorder() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        node1.neighbors = listOf(node3, node2, node4)
        val node5 = Node(5)
        val node6 = Node(6)
        node3.neighbors = listOf(node5, node6)
        assertThat(Solution().preorder(node1), equalTo(listOf(1, 3, 5, 6, 2, 4)))
    }

    @Test
    fun preorder2() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        val node5 = Node(5)
        val node6 = Node(6)
        val node7 = Node(7)
        val node8 = Node(8)
        val node9 = Node(9)
        val node10 = Node(10)
        val node11 = Node(11)
        val node12 = Node(12)
        val node13 = Node(13)
        val node14 = Node(14)
        node11.neighbors = listOf(node14)
        node7.neighbors = listOf(node11)
        node3.neighbors = listOf(node6, node7)
        node8.neighbors = listOf(node12)
        node4.neighbors = listOf(node8)
        node9.neighbors = listOf(node13)
        node5.neighbors = listOf(node9, node10)
        node1.neighbors = listOf(node2, node3, node4, node5)
        assertThat(
            Solution().preorder(node1),
            equalTo(listOf(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10)),
        )
    }

    @Test
    fun preorder3() {
        assertThat(Solution().preorder(null), equalTo(listOf()))
    }
}
