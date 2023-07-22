package g2401_2500.s2448_minimum_cost_to_make_array_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution().minCost(intArrayOf(1, 3, 5, 2), intArrayOf(2, 3, 1, 14)),
            equalTo(8L)
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution().minCost(intArrayOf(2, 2, 2, 2, 2), intArrayOf(4, 2, 8, 1, 3)),
            equalTo(0L)
        )
    }
}
