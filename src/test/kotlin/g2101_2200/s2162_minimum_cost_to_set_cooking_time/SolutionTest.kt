package g2101_2200.s2162_minimum_cost_to_set_cooking_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostSetTime() {
        assertThat(Solution().minCostSetTime(1, 2, 1, 600), equalTo(6))
    }

    @Test
    fun minCostSetTime2() {
        assertThat(Solution().minCostSetTime(0, 1, 2, 76), equalTo(6))
    }

    @Test
    fun minCostSetTime3() {
        assertThat(Solution().minCostSetTime(0, 9, 18, 460), equalTo(81))
    }
}
