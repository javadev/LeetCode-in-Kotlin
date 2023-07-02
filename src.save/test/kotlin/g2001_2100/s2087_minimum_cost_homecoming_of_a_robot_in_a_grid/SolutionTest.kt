package g2001_2100.s2087_minimum_cost_homecoming_of_a_robot_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution()
                .minCost(intArrayOf(1, 0), intArrayOf(2, 3), intArrayOf(5, 4, 3), intArrayOf(8, 2, 6, 7)),
            equalTo(18)
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution()
                .minCost(intArrayOf(0, 0), intArrayOf(0, 0), intArrayOf(5), intArrayOf(26)),
            equalTo(0)
        )
    }
}
