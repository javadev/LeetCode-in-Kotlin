package g3101_3200.s3169_count_days_without_meetings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDays() {
        assertThat(
            Solution().countDays(
                10,
                arrayOf(intArrayOf(5, 7), intArrayOf(1, 3), intArrayOf(9, 10))
            ),
            equalTo(2)
        )
    }

    @Test
    fun countDays2() {
        assertThat(
            Solution().countDays(5, arrayOf(intArrayOf(2, 4), intArrayOf(1, 3))),
            equalTo(1)
        )
    }

    @Test
    fun countDays3() {
        assertThat(Solution().countDays(6, arrayOf(intArrayOf(1, 6))), equalTo(0))
    }
}
