package g2101_2200.s2188_minimum_time_to_finish_the_race

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumFinishTime() {
        MatcherAssert.assertThat(
            Solution().minimumFinishTime(arrayOf(intArrayOf(2, 3), intArrayOf(3, 4)), 5, 4), CoreMatchers.equalTo(21)
        )
    }

    @Test
    fun minimumFinishTime2() {
        MatcherAssert.assertThat(
            Solution().minimumFinishTime(arrayOf(intArrayOf(1, 10), intArrayOf(2, 2), intArrayOf(3, 4)), 6, 5),
            CoreMatchers.equalTo(25)
        )
    }
}
