package g2501_2600.s2589_minimum_time_to_complete_all_tasks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinimumTime() {
        assertThat(
            Solution().findMinimumTime(
                arrayOf(
                    intArrayOf(2, 3, 1), intArrayOf(4, 5, 1),
                    intArrayOf(1, 5, 2)
                )
            ),
            equalTo(2)
        )
    }

    @Test
    fun findMinimumTime2() {
        assertThat(
            Solution().findMinimumTime(
                arrayOf(
                    intArrayOf(1, 3, 2), intArrayOf(2, 5, 3),
                    intArrayOf(5, 6, 2)
                )
            ),
            equalTo(4)
        )
    }
}
