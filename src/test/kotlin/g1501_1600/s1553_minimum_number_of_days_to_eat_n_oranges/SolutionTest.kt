package g1501_1600.s1553_minimum_number_of_days_to_eat_n_oranges

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDays() {
        MatcherAssert.assertThat(Solution().minDays(10), CoreMatchers.equalTo(4))
    }

    @Test
    fun minDays2() {
        MatcherAssert.assertThat(Solution().minDays(6), CoreMatchers.equalTo(3))
    }
}