package g1501_1600.s1573_number_of_ways_to_split_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numWays() {
        assertThat(Solution().numWays("10101"), equalTo(4))
    }

    @Test
    fun numWays2() {
        assertThat(Solution().numWays("1001"), equalTo(0))
    }

    @Test
    fun numWays3() {
        assertThat(Solution().numWays("0000"), equalTo(3))
    }
}
