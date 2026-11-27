package g4001_4100.s4025_minimize_the_maximum_waiting_time_at_synchronized_traffic_lights

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPenalty() {
        assertThat<Int>(
            Solution().minPenalty(10, intArrayOf(3, 5), intArrayOf(1, 2, 8)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minPenalty2() {
        assertThat<Int>(
            Solution().minPenalty(10, intArrayOf(3), intArrayOf(1, 2, 3)),
            equalTo<Int>(7),
        )
    }

    @Test
    fun minPenalty3() {
        assertThat<Int>(
            Solution().minPenalty(10, intArrayOf(3), intArrayOf(13, 18)),
            equalTo<Int>(7),
        )
    }
}
