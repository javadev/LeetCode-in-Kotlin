package g1501_1600.s1553_minimum_number_of_days_to_eat_n_oranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDays() {
        assertThat(Solution().minDays(10), equalTo(4))
    }

    @Test
    fun minDays2() {
        assertThat(Solution().minDays(6), equalTo(3))
    }
}
