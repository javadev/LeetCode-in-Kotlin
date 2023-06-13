package g1501_1600.s1568_minimum_number_of_days_to_disconnect_island

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDays() {
        MatcherAssert.assertThat(
            Solution().minDays(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 0))),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun minDays2() {
        MatcherAssert.assertThat(Solution().minDays(arrayOf(intArrayOf(1, 1))), CoreMatchers.equalTo(2))
    }
}
