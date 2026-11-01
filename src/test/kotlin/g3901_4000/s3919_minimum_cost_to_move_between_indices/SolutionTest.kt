package g3901_4000.s3919_minimum_cost_to_move_between_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<IntArray>(
            Solution().minCost(
                intArrayOf(-5, -2, 3),
                arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(2, 0), intArrayOf(1, 2)),
            ),
            equalTo<IntArray>(intArrayOf(6, 2, 5)),
        )
    }

    @Test
    fun minCost2() {
        assertThat<IntArray>(
            Solution()
                .minCost(
                    intArrayOf(0, 2, 3, 9),
                    arrayOf<IntArray>(intArrayOf(3, 0), intArrayOf(1, 2), intArrayOf(2, 0)),
                ),
            equalTo<IntArray>(intArrayOf(4, 1, 3)),
        )
    }
}
