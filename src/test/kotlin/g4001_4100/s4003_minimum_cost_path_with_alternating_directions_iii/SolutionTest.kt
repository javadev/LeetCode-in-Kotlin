package g4001_4100.s4003_minimum_cost_path_with_alternating_directions_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Long>(
            Solution().minCost(
                2,
                2,
                arrayOf<IntArray>(intArrayOf(5, 3), intArrayOf(1, 4)),
            ),
            equalTo<Long>(8L),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Long>(
            Solution().minCost(
                2,
                2,
                arrayOf<IntArray>(intArrayOf(0, 7), intArrayOf(3, 2)),
            ),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun minCost3() {
        assertThat<Long>(
            Solution().minCost(
                2,
                3,
                arrayOf<IntArray>(intArrayOf(8, 0, 9), intArrayOf(7, 4, 1)),
            ),
            equalTo<Long>(12L),
        )
    }
}
