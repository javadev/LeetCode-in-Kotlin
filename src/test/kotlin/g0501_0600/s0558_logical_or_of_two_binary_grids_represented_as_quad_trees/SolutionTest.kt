package g0501_0600.s0558_logical_or_of_two_binary_grids_represented_as_quad_trees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun intersect() {
        val node1 = Node(true, false)
        node1.topLeft = Node(true, true)
        node1.topRight = Node(true, true)
        node1.bottomLeft = Node(false, true)
        node1.bottomRight = Node(false, true)
        val node2 = Node(true, false)
        node2.topLeft = Node(true, true)
        node2.topRight = Node(true, false)
        node2.bottomLeft = Node(true, true)
        node2.bottomRight = Node(false, true)
        node2.topRight!!.topLeft = Node(false, true)
        node2.topRight!!.topRight = Node(false, true)
        node2.topRight!!.bottomLeft = Node(true, true)
        node2.topRight!!.bottomRight = Node(true, true)
        assertThat(
            Solution().intersect(node1, node2).toString(),
            equalTo("[0,0][1,1][1,1][1,1][1,0]")
        )
    }
}
