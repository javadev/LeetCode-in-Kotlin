package g1401_1500.s1482_minimum_number_of_days_to_make_m_bouquets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDays() {
        assertThat(Solution().minDays(intArrayOf(1, 10, 3, 10, 2), 3, 2), equalTo(-1))
    }

    @Test
    fun minDays2() {
        assertThat(Solution().minDays(intArrayOf(1, 10, 3, 10, 2), 3, 2), equalTo(-1))
    }

    @Test
    fun minDays3() {
        assertThat(Solution().minDays(intArrayOf(7, 7, 7, 7, 12, 7, 7), 2, 3), equalTo(12))
    }
}
