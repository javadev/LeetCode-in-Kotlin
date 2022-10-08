package g0101_0200.s0117_populating_next_right_pointers_in_each_node_ii

import com_github_leetcode.LeftRight.Node

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun connect() {
        assertThat(Solution().connect(null), equalTo(null))
    }

    @Test
    fun connect2() {
        val node = Node(
            1,
            Node(2, Node(4), Node(5), null),
            Node(3, null, Node(7), null),
            null
        )
        val node7 = Node(7)
        val node3 = Node(3, null, node7, null)
        val node5 = Node(5, null, null, node7)
        val node4 = Node(4, null, null, node5)
        val node2 = Node(2, node4, node5, node3)
        val node1 = Node(1, node2, node3, null)
        assertThat(Solution().connect(node).toString(), equalTo(node1.toString()))
    }

    @Test
    fun connect3() {
        val node = Node(
            1,
            Node(2, Node(4, Node(7), null, null), Node(5), null),
            Node(3, null, Node(6, null, Node(8), null), null),
            null
        )
        val node8 = Node(8, null, null, null)
        val node7 = Node(7, null, null, node8)
        val node6 = Node(6, null, node8, null)
        val node3 = Node(3, null, node6, null)
        val node5 = Node(5, null, null, node6)
        val node4 = Node(4, node7, null, node5)
        val node2 = Node(2, node4, node5, node3)
        val node1 = Node(1, node2, node3, null)
        assertThat(Solution().connect(node).toString(), equalTo(node1.toString()))
    }
}
