package g2501_2600.s2547_minimum_cost_to_split_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution().minCost(intArrayOf(1, 2, 1, 2, 1, 3, 3), 2),
            equalTo(8)
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution().minCost(intArrayOf(1, 2, 1, 2, 1), 2),
            equalTo(6)
        )
    }

    @Test
    fun minCost3() {
        assertThat(
            Solution().minCost(intArrayOf(1, 2, 1, 2, 1), 5),
            equalTo(10)
        )
    }
}
