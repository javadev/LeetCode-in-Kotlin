package g2301_2400.s2332_the_latest_time_to_catch_a_bus

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun latestTimeCatchTheBus() {
        assertThat(
            Solution()
                .latestTimeCatchTheBus(intArrayOf(10, 20), intArrayOf(2, 17, 18, 19), 2),
            equalTo(16)
        )
    }

    @Test
    fun latestTimeCatchTheBus2() {
        assertThat(
            Solution()
                .latestTimeCatchTheBus(intArrayOf(20, 30, 10), intArrayOf(19, 13, 26, 4, 25, 11, 21), 2),
            equalTo(20)
        )
    }

    @Test
    fun latestTimeCatchTheBus3() {
        assertThat(
            Solution().latestTimeCatchTheBus(intArrayOf(3), intArrayOf(2, 4), 2),
            equalTo(3)
        )
    }
}