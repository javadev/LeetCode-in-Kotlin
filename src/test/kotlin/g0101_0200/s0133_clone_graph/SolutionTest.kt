package g0101_0200.s0133_clone_graph

import com_github_leetcode.neighbors.Node
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun cloneGraph() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        val node1and2and4 = Node(1, Arrays.asList(node2, node4))
        val node2and1and3 = Node(2, Arrays.asList(node1, node3))
        val node3and2and4 = Node(3, Arrays.asList(node2, node4))
        val node4and1and3 = Node(4, Arrays.asList(node1, node3))
        val node = Node(
            5,
            Arrays.asList(node1and2and4, node2and1and3, node3and2and4, node4and1and3)
        )
        assertThat(
            Solution().cloneGraph(node).toString(), equalTo("[[2,4],[1,3],[2,4],[1,3]]")
        )
    }

    @Test
    fun cloneGraph2() {
        val node1 = Node(1)
        assertThat(Solution().cloneGraph(node1).toString(), equalTo("[]"))
    }

    @Test
    fun cloneGraph3() {
        assertThat(Solution().cloneGraph(null), equalTo(null))
    }
}
