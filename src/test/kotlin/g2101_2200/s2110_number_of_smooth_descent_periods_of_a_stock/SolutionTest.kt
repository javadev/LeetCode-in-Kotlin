package g2101_2200.s2110_number_of_smooth_descent_periods_of_a_stock

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun descentPeriods() {
        assertThat(Solution().getDescentPeriods(intArrayOf(3, 2, 1, 4)), equalTo(7L))
    }

    @Test
    fun descentPeriods2() {
        assertThat(Solution().getDescentPeriods(intArrayOf(8, 6, 7, 7)), equalTo(4L))
    }

    @Test
    fun descentPeriods3() {
        assertThat(Solution().getDescentPeriods(intArrayOf(1)), equalTo(1L))
    }
}
