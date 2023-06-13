package g1501_1600.s1599_maximum_profit_of_operating_a_centennial_wheel

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperationsMaxProfit() {
        MatcherAssert.assertThat(Solution().minOperationsMaxProfit(intArrayOf(8, 3), 5, 6), CoreMatchers.equalTo(3))
    }

    @Test
    fun minOperationsMaxProfit2() {
        MatcherAssert.assertThat(Solution().minOperationsMaxProfit(intArrayOf(10, 9, 6), 6, 4), CoreMatchers.equalTo(7))
    }

    @Test
    fun minOperationsMaxProfit3() {
        MatcherAssert.assertThat(
            Solution().minOperationsMaxProfit(intArrayOf(3, 4, 0, 5, 1), 1, 92),
            CoreMatchers.equalTo(-1)
        )
    }
}
