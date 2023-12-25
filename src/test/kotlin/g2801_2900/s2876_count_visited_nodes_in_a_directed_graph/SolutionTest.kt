package g2801_2900.s2876_count_visited_nodes_in_a_directed_graph

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVisitedNodes() {
        MatcherAssert.assertThat(
            Solution().countVisitedNodes(mutableListOf(1, 2, 0, 0)),
            CoreMatchers.equalTo(intArrayOf(3, 3, 3, 4))
        )
    }

    @Test
    fun countVisitedNodes2() {
        MatcherAssert.assertThat(
            Solution().countVisitedNodes(mutableListOf(1, 2, 3, 4, 0)),
            CoreMatchers.equalTo(intArrayOf(5, 5, 5, 5, 5))
        )
    }
}
