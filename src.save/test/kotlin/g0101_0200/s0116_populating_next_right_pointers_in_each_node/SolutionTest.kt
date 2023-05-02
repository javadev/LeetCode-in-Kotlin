package g0101_0200.s0116_populating_next_right_pointers_in_each_node

import com_github_leetcode.left_right.Node
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
            Node(3, Node(6), Node(7), null),
            null
        )
        val node7 = Node(7)
        val node6 = Node(6, null, null, node7)
        val node3 = Node(3, node6, node7, null)
        val node5 = Node(5, null, null, node6)
        val node4 = Node(4, null, null, node5)
        val node2 = Node(2, node4, node5, node3)
        val node1 = Node(1, node2, node3, null)
        assertThat(Solution().connect(node).toString(), equalTo(node1.toString()))
    }
}
