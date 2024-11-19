package g0401_0500.s0435_non_overlapping_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun eraseOverlapIntervals() {
        assertThat(
            Solution().eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(1, 3),
                ),
            ),
            equalTo(1),
        )
    }

    @Test
    fun eraseOverlapIntervals2() {
        assertThat(
            Solution().eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))),
            equalTo(2),
        )
    }

    @Test
    fun eraseOverlapIntervals3() {
        assertThat(Solution().eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))), equalTo(0))
    }
}
