package g2501_2600.s2532_time_to_cross_a_bridge

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCrossingTime() {
        assertThat(
            Solution()
                .findCrossingTime(
                    1, 3, arrayOf(intArrayOf(1, 1, 2, 1), intArrayOf(1, 1, 3, 1), intArrayOf(1, 1, 4, 1))
                ),
            equalTo(6)
        )
    }

    @Test
    fun findCrossingTime2() {
        assertThat(
            Solution().findCrossingTime(3, 2, arrayOf(intArrayOf(1, 9, 1, 8), intArrayOf(10, 10, 10, 10))),
            equalTo(50)
        )
    }
}
