package g2101_2200.s2187_minimum_time_to_complete_trips

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        MatcherAssert.assertThat(Solution().minimumTime(intArrayOf(1, 2, 3), 5), CoreMatchers.equalTo(3L))
    }

    @Test
    fun minimumTime2() {
        MatcherAssert.assertThat(Solution().minimumTime(intArrayOf(2), 1), CoreMatchers.equalTo(2L))
    }
}
