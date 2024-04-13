package g3101_3200.s3108_minimum_cost_walk_in_weighted_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(
            Solution()
                .minimumCost(
                    5,
                    arrayOf(intArrayOf(0, 1, 7), intArrayOf(1, 3, 7), intArrayOf(1, 2, 1)),
                    arrayOf(intArrayOf(0, 3), intArrayOf(3, 4))
                ),
            equalTo(intArrayOf(1, -1))
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(
            Solution()
                .minimumCost(
                    3,
                    arrayOf(intArrayOf(0, 2, 7), intArrayOf(0, 1, 15), intArrayOf(1, 2, 6), intArrayOf(1, 2, 1)),
                    arrayOf(intArrayOf(1, 2))
                ),
            equalTo(intArrayOf(0))
        )
    }
}
