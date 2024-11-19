package g2501_2600.s2577_minimum_time_to_visit_a_cell_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat(
            Solution().minimumTime(arrayOf(intArrayOf(0, 1, 3, 2), intArrayOf(5, 1, 2, 5), intArrayOf(4, 3, 8, 6))),
            equalTo(7),
        )
    }

    @Test
    fun minimumTime2() {
        assertThat(
            Solution().minimumTime(arrayOf(intArrayOf(0, 2, 4), intArrayOf(3, 2, 1), intArrayOf(1, 0, 4))),
            equalTo(-1),
        )
    }
}
