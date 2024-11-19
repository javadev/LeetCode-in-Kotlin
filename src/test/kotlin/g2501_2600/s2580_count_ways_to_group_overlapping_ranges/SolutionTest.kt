package g2501_2600.s2580_count_ways_to_group_overlapping_ranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countWays() {
        assertThat(
            Solution().countWays(arrayOf(intArrayOf(6, 10), intArrayOf(5, 15))),
            equalTo(2),
        )
    }

    @Test
    fun countWays2() {
        assertThat(
            Solution().countWays(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(10, 20),
                    intArrayOf(2, 5),
                    intArrayOf(4, 8),
                ),
            ),
            equalTo(4),
        )
    }
}
