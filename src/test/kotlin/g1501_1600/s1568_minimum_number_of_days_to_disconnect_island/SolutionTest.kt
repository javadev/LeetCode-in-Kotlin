package g1501_1600.s1568_minimum_number_of_days_to_disconnect_island

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDays() {
        assertThat(
            Solution().minDays(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 0))),
            equalTo(2),
        )
    }

    @Test
    fun minDays2() {
        assertThat(Solution().minDays(arrayOf(intArrayOf(1, 1))), equalTo(2))
    }
}
