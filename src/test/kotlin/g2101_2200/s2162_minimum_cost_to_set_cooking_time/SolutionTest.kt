package g2101_2200.s2162_minimum_cost_to_set_cooking_time

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostSetTime() {
        MatcherAssert.assertThat(Solution().minCostSetTime(1, 2, 1, 600), CoreMatchers.equalTo(6))
    }

    @Test
    fun minCostSetTime2() {
        MatcherAssert.assertThat(Solution().minCostSetTime(0, 1, 2, 76), CoreMatchers.equalTo(6))
    }

    @Test
    fun minCostSetTime3() {
        MatcherAssert.assertThat(Solution().minCostSetTime(0, 9, 18, 460), CoreMatchers.equalTo(81))
    }
}
