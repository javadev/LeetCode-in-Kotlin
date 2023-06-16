package g1701_1800.s1701_average_waiting_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun averageWaitingTime() {
        assertThat(
            Solution().averageWaitingTime(arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(4, 3))),
            equalTo(5.000)
        )
    }

    @Test
    fun averageWaitingTime2() {
        assertThat(
            Solution().averageWaitingTime(
                arrayOf(
                    intArrayOf(5, 2), intArrayOf(5, 4),
                    intArrayOf(10, 3), intArrayOf(20, 1)
                )
            ),
            equalTo(3.25)
        )
    }
}
