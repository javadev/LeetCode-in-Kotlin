package g0501_0600.s0559_maximum_depth_of_n_ary_tree

import com_github_leetcode.Node
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDepth() {
        val root = Node(1)
        val node3 = Node(3)
        val node2 = Node(2)
        val node4 = Node(4)
        root.neighbors = listOf(node3, node2, node4)
        val node5 = Node(5)
        val node6 = Node(6)
        node3.neighbors = listOf(node5, node6)
        assertThat(Solution().maxDepth(root), equalTo(3))
    }
}
