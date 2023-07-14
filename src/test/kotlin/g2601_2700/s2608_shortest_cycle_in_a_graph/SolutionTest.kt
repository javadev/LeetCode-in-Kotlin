package g2601_2700.s2608_shortest_cycle_in_a_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findShortestCycle() {
        assertThat(
            Solution().findShortestCycle(
                7,
                arrayOf(
                    intArrayOf(0, 1), intArrayOf(1, 2),
                    intArrayOf(2, 0), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(6, 3)
                )
            ),
            equalTo(3)
        )
    }

    @Test
    fun findShortestCycle2() {
        assertThat(Solution().findShortestCycle(4, arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))), equalTo(-1))
    }
}
