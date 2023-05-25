package g0801_0900.s0871_minimum_number_of_refueling_stops

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minRefuelStops() {
        assertThat(Solution().minRefuelStops(1, 1, arrayOf()), equalTo(0))
    }

    @Test
    fun minRefuelStops2() {
        assertThat(Solution().minRefuelStops(100, 1, arrayOf(intArrayOf(10, 100))), equalTo(-1))
    }

    @Test
    fun minRefuelStops3() {
        assertThat(
            Solution()
                .minRefuelStops(
                    100, 10, arrayOf(intArrayOf(10, 60), intArrayOf(20, 30), intArrayOf(30, 30), intArrayOf(60, 40))
                ),
            equalTo(2)
        )
    }
}
