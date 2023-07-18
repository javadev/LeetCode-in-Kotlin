package g2601_2700.s2642_design_graph_with_shortest_path_calculator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class GraphTest {
    @Test
    fun graphTest() {
        val graph = Graph(
            4,
            arrayOf(
                intArrayOf(0, 2, 5), intArrayOf(0, 1, 2),
                intArrayOf(1, 2, 1), intArrayOf(3, 0, 3)
            )
        )
        assertThat(graph.shortestPath(3, 2), equalTo(6))
        assertThat(graph.shortestPath(0, 3), equalTo(-1))
        graph.addEdge(intArrayOf(1, 3, 4))
        assertThat(graph.shortestPath(0, 3), equalTo(6))
    }
}
