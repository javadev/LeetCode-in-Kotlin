package g0701_0800.s0743_network_delay_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun networkDelayTime() {
        assertThat(
            Solution()
                .networkDelayTime(arrayOf(intArrayOf(2, 1, 1), intArrayOf(2, 3, 1), intArrayOf(3, 4, 1)), 4, 2),
            equalTo(2),
        )
    }

    @Test
    fun networkDelayTime2() {
        assertThat(Solution().networkDelayTime(arrayOf(intArrayOf(1, 2, 1)), 2, 1), equalTo(1))
    }

    @Test
    fun networkDelayTime3() {
        assertThat(Solution().networkDelayTime(arrayOf(intArrayOf(1, 2, 1)), 2, 2), equalTo(-1))
    }
}
