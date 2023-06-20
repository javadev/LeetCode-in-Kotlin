package g1901_2000.s1970_last_day_where_you_can_still_cross

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun latestDayToCross() {
        assertThat(
            Solution().latestDayToCross(
                2,
                2,
                arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(1, 2), intArrayOf(2, 2))
            ),
            equalTo(2)
        )
    }

    @Test
    fun latestDayToCross2() {
        assertThat(
            Solution().latestDayToCross(
                2,
                2,
                arrayOf(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(2, 2))
            ),
            equalTo(1)
        )
    }

    @Test
    fun latestDayToCross3() {
        assertThat(
            Solution()
                .latestDayToCross(
                    3,
                    3,
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 1),
                        intArrayOf(3, 3),
                        intArrayOf(2, 2),
                        intArrayOf(1, 1),
                        intArrayOf(1, 3),
                        intArrayOf(2, 3),
                        intArrayOf(3, 2),
                        intArrayOf(3, 1)
                    )
                ),
            equalTo(3)
        )
    }
}
