package g2101_2200.s2187_minimum_time_to_complete_trips

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat(Solution().minimumTime(intArrayOf(1, 2, 3), 5), equalTo(3L))
    }

    @Test
    fun minimumTime2() {
        assertThat(Solution().minimumTime(intArrayOf(2), 1), equalTo(2L))
    }
}
