package g2801_2900.s2876_count_visited_nodes_in_a_directed_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVisitedNodes() {
        assertThat(
            Solution().countVisitedNodes(mutableListOf(1, 2, 0, 0)),
            equalTo(intArrayOf(3, 3, 3, 4)),
        )
    }

    @Test
    fun countVisitedNodes2() {
        assertThat(
            Solution().countVisitedNodes(mutableListOf(1, 2, 3, 4, 0)),
            equalTo(intArrayOf(5, 5, 5, 5, 5)),
        )
    }
}
