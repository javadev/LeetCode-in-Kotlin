package g2801_2900.s2801_count_stepping_numbers_in_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSteppingNumbers() {
        assertThat(Solution().countSteppingNumbers("1", "11"), equalTo(10))
    }

    @Test
    fun countSteppingNumbers2() {
        assertThat(Solution().countSteppingNumbers("90", "101"), equalTo(2))
    }
}
