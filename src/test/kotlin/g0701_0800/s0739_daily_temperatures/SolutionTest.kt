package g0701_0800.s0739_daily_temperatures

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dailyTemperatures() {
        assertThat(
            Solution().dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)),
            equalTo(intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)),
        )
    }

    @Test
    fun dailyTemperatures2() {
        assertThat(
            Solution().dailyTemperatures(intArrayOf(30, 40, 50, 60)),
            equalTo(intArrayOf(1, 1, 1, 0)),
        )
    }

    @Test
    fun dailyTemperatures3() {
        assertThat(
            Solution().dailyTemperatures(intArrayOf(30, 60, 90)),
            equalTo(intArrayOf(1, 1, 0)),
        )
    }
}
