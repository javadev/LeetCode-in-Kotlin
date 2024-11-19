package g2301_2400.s2316_count_unreachable_pairs_of_nodes_in_an_undirected_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(
            Solution().countPairs(
                3,
                arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2)),
            ),
            equalTo(0L),
        )
    }

    @Test
    fun countPairs2() {
        assertThat(
            Solution().countPairs(
                7,
                arrayOf(intArrayOf(0, 2), intArrayOf(0, 5), intArrayOf(2, 4), intArrayOf(1, 6), intArrayOf(5, 4)),
            ),
            equalTo(14L),
        )
    }
}
