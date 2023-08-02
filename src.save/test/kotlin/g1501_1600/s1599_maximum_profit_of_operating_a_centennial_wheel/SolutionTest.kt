package g1501_1600.s1599_maximum_profit_of_operating_a_centennial_wheel

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperationsMaxProfit() {
        assertThat(Solution().minOperationsMaxProfit(intArrayOf(8, 3), 5, 6), equalTo(3))
    }

    @Test
    fun minOperationsMaxProfit2() {
        assertThat(Solution().minOperationsMaxProfit(intArrayOf(10, 9, 6), 6, 4), equalTo(7))
    }

    @Test
    fun minOperationsMaxProfit3() {
        assertThat(
            Solution().minOperationsMaxProfit(intArrayOf(3, 4, 0, 5, 1), 1, 92),
            equalTo(-1)
        )
    }
}
