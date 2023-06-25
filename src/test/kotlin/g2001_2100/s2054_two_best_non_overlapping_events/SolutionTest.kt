package g2001_2100.s2054_two_best_non_overlapping_events

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTwoEvents1() {
        val events = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(2, 4, 3))
        assertThat(Solution().maxTwoEvents(events), equalTo(4))
    }

    @Test
    fun maxTwoEvents2() {
        val events = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(1, 5, 5))
        assertThat(Solution().maxTwoEvents(events), equalTo(5))
    }

    @Test
    fun maxTwoEvents3() {
        val events = arrayOf(intArrayOf(1, 5, 3), intArrayOf(1, 5, 1), intArrayOf(6, 6, 5))
        assertThat(Solution().maxTwoEvents(events), equalTo(8))
    }
}
