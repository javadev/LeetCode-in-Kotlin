package g2501_2600.s2561_rearranging_fruits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution().minCost(intArrayOf(4, 2, 2, 2), intArrayOf(1, 4, 1, 2)),
            equalTo(1),
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution().minCost(intArrayOf(2, 3, 4, 1), intArrayOf(3, 2, 5, 1)),
            equalTo(-1),
        )
    }
}
