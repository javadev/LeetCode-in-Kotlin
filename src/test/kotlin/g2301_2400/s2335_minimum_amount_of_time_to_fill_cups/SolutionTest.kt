package g2301_2400.s2335_minimum_amount_of_time_to_fill_cups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fillCups() {
        assertThat(Solution().fillCups(intArrayOf(1, 4, 2)), equalTo(4))
    }

    @Test
    fun fillCups2() {
        assertThat(Solution().fillCups(intArrayOf(5, 4, 4)), equalTo(7))
    }

    @Test
    fun fillCups3() {
        assertThat(Solution().fillCups(intArrayOf(5, 0, 0)), equalTo(5))
    }
}
