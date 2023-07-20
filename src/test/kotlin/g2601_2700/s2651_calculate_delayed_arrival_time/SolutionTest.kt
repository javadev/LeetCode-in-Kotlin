package g2601_2700.s2651_calculate_delayed_arrival_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDelayedArrivalTime() {
        assertThat(
            Solution().findDelayedArrivalTime(15, 5),
            equalTo(20)
        )
    }

    @Test
    fun findDelayedArrivalTime2() {
        assertThat(
            Solution().findDelayedArrivalTime(13, 11),
            equalTo(0)
        )
    }
}
