package g3401_3500.s3440_reschedule_meetings_for_maximum_free_time_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFreeTime() {
        assertThat<Int>(
            Solution().maxFreeTime(5, intArrayOf(1, 3), intArrayOf(2, 5)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxFreeTime2() {
        assertThat<Int>(
            Solution().maxFreeTime(10, intArrayOf(0, 7, 9), intArrayOf(1, 8, 10)),
            equalTo<Int>(7),
        )
    }

    @Test
    fun maxFreeTime3() {
        assertThat<Int>(
            Solution().maxFreeTime(10, intArrayOf(0, 3, 7, 9), intArrayOf(1, 4, 8, 10)),
            equalTo<Int>(6),
        )
    }

    @Test
    fun maxFreeTime4() {
        assertThat<Int>(
            Solution().maxFreeTime(5, intArrayOf(0, 1, 2, 3, 4), intArrayOf(1, 2, 3, 4, 5)),
            equalTo<Int>(0),
        )
    }
}
