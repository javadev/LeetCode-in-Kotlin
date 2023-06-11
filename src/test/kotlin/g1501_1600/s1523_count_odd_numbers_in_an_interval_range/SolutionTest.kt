package g1501_1600.s1523_count_odd_numbers_in_an_interval_range

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOdds() {
        MatcherAssert.assertThat(Solution().countOdds(3, 7), CoreMatchers.equalTo(3))
    }

    @Test
    fun countOdds2() {
        MatcherAssert.assertThat(Solution().countOdds(8, 10), CoreMatchers.equalTo(1))
    }
}
