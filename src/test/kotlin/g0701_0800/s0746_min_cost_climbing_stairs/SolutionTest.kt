package g0701_0800.s0746_min_cost_climbing_stairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostClimbingStairs() {
        assertThat(Solution().minCostClimbingStairs(intArrayOf(10, 15, 20)), equalTo(15))
    }

    @Test
    fun minCostClimbingStairs2() {
        assertThat(
            Solution()
                .minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)),
            equalTo(6)
        )
    }
}
