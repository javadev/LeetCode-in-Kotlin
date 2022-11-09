package g0301_0400.s0312_burst_balloons

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCoins() {
        assertThat(Solution().maxCoins(intArrayOf(3, 1, 5, 8)), equalTo(167))
    }

    @Test
    fun maxCoins2() {
        assertThat(Solution().maxCoins(intArrayOf(1, 5)), equalTo(10))
    }
}
