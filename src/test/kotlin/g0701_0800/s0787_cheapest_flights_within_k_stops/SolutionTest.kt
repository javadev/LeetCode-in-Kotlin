package g0701_0800.s0787_cheapest_flights_within_k_stops

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCheapestPrice() {
        assertThat(
            Solution()
                .findCheapestPrice(
                    3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)), 0, 2, 1
                ),
            equalTo(200)
        )
    }

    @Test
    fun findCheapestPrice2() {
        assertThat(
            Solution()
                .findCheapestPrice(
                    3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)), 0, 2, 0
                ),
            equalTo(500)
        )
    }
}
