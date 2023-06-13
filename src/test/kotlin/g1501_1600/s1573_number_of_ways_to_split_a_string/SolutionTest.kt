package g1501_1600.s1573_number_of_ways_to_split_a_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numWays() {
        MatcherAssert.assertThat(Solution().numWays("10101"), CoreMatchers.equalTo(4))
    }

    @Test
    fun numWays2() {
        MatcherAssert.assertThat(Solution().numWays("1001"), CoreMatchers.equalTo(0))
    }

    @Test
    fun numWays3() {
        MatcherAssert.assertThat(Solution().numWays("0000"), CoreMatchers.equalTo(3))
    }
}
