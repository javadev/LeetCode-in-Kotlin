package g4001_4100.s4009_minimum_possible_maximum_waiting_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMaxWaitingTime() {
        assertThat<Int>(
            Solution().minMaxWaitingTime(intArrayOf(6, 8, 4, 6, 5), intArrayOf(16, 13)),
            equalTo<Int>(6),
        )
    }

    @Test
    fun minMaxWaitingTime2() {
        assertThat<Int>(
            Solution().minMaxWaitingTime(intArrayOf(10, 15), intArrayOf(12, 17)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minMaxWaitingTime3() {
        assertThat<Int>(
            Solution().minMaxWaitingTime(intArrayOf(10, 5), intArrayOf(8, 8)),
            equalTo<Int>(-1),
        )
    }
}
