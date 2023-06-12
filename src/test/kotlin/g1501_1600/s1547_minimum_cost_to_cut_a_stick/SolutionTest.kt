package g1501_1600.s1547_minimum_cost_to_cut_a_stick

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(Solution().minCost(7, intArrayOf(1, 3, 4, 5)), equalTo(16))
    }

    @Test
    fun minCost2() {
        assertThat(Solution().minCost(9, intArrayOf(5, 6, 1, 4, 2)), equalTo(22))
    }
}
