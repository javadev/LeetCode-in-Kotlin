package g2801_2900.s2855_minimum_right_shifts_to_sort_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumRightShifts() {
        assertThat(Solution().minimumRightShifts(mutableListOf(3, 4, 5, 1, 2)), equalTo(2))
    }

    @Test
    fun minimumRightShifts2() {
        assertThat(Solution().minimumRightShifts(mutableListOf(1, 3, 5)), equalTo(0))
    }

    @Test
    fun minimumRightShifts3() {
        assertThat(Solution().minimumRightShifts(mutableListOf(2, 1, 4)), equalTo(-1))
    }
}
