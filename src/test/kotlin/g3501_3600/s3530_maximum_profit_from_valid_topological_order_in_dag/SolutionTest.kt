package g3501_3600.s3530_maximum_profit_from_valid_topological_order_in_dag

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat<Int>(
            Solution().maxProfit(2, arrayOf<IntArray>(intArrayOf(0, 1)), intArrayOf(2, 3)),
            equalTo<Int>(8),
        )
    }

    @Test
    fun maxProfit2() {
        assertThat<Int>(
            Solution().maxProfit(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2)), intArrayOf(1, 6, 3)),
            equalTo<Int>(25),
        )
    }
}
