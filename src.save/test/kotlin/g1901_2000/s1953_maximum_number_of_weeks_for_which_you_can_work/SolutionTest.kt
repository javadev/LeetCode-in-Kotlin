package g1901_2000.s1953_maximum_number_of_weeks_for_which_you_can_work

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWeeks() {
        assertThat(Solution().numberOfWeeks(intArrayOf(1, 2, 3)), equalTo(6L))
    }

    @Test
    fun numberOfWeeks2() {
        assertThat(Solution().numberOfWeeks(intArrayOf(5, 2, 1)), equalTo(7L))
    }
}
