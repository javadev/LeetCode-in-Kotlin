package g3601_3700.s3650_minimum_cost_path_with_edge_reversals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(
            Solution().minCost(
                4,
                arrayOf<IntArray>(intArrayOf(0, 1, 3), intArrayOf(3, 1, 1), intArrayOf(2, 3, 4), intArrayOf(0, 2, 2)),
            ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Int>(
            Solution().minCost(
                4,
                arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(2, 1, 1), intArrayOf(1, 3, 1), intArrayOf(2, 3, 3)),
            ),
            equalTo<Int>(3),
        )
    }
}
