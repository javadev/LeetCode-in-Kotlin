package g2201_2300.s2210_count_hills_and_valleys_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countHillValley() {
        assertThat(Solution().countHillValley(intArrayOf(2, 4, 1, 1, 6, 5)), equalTo(3))
    }

    @Test
    fun countHillValley2() {
        assertThat(Solution().countHillValley(intArrayOf(6, 6, 5, 5, 4, 1)), equalTo(0))
    }
}
