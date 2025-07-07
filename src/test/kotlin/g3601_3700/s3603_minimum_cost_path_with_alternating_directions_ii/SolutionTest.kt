package g3601_3700.s3603_minimum_cost_path_with_alternating_directions_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Long>(
            Solution().minCost(1, 2, arrayOf<IntArray>(intArrayOf(1, 2))),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Long>(
            Solution().minCost(
                2,
                2,
                arrayOf<IntArray>(intArrayOf(3, 5), intArrayOf(2, 4)),
            ),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun minCost3() {
        assertThat<Long>(
            Solution().minCost(
                2,
                3,
                arrayOf<IntArray>(intArrayOf(6, 1, 4), intArrayOf(3, 2, 5)),
            ),
            equalTo<Long>(16L),
        )
    }
}
