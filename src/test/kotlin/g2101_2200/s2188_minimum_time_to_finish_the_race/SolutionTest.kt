package g2101_2200.s2188_minimum_time_to_finish_the_race

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumFinishTime() {
        assertThat(
            Solution().minimumFinishTime(arrayOf(intArrayOf(2, 3), intArrayOf(3, 4)), 5, 4), equalTo(21)
        )
    }

    @Test
    fun minimumFinishTime2() {
        assertThat(
            Solution().minimumFinishTime(arrayOf(intArrayOf(1, 10), intArrayOf(2, 2), intArrayOf(3, 4)), 6, 5),
            equalTo(25)
        )
    }
}
