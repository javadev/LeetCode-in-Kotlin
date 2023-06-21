package g1801_1900.s1870_minimum_speed_to_arrive_on_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSpeedOnTime() {
        assertThat(Solution().minSpeedOnTime(intArrayOf(1, 3, 2), 6.0), equalTo(1))
    }

    @Test
    fun minSpeedOnTime2() {
        assertThat(Solution().minSpeedOnTime(intArrayOf(1, 3, 2), 2.7), equalTo(3))
    }

    @Test
    fun minSpeedOnTime3() {
        assertThat(Solution().minSpeedOnTime(intArrayOf(1, 3, 2), 1.9), equalTo(-1))
    }
}
