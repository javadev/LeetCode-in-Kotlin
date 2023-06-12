package g1501_1600.s1523_count_odd_numbers_in_an_interval_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOdds() {
        assertThat(Solution().countOdds(3, 7), equalTo(3))
    }

    @Test
    fun countOdds2() {
        assertThat(Solution().countOdds(8, 10), equalTo(1))
    }
}
