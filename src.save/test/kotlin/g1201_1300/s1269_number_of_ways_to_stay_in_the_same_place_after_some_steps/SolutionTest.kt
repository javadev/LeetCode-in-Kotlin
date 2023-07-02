package g1201_1300.s1269_number_of_ways_to_stay_in_the_same_place_after_some_steps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numWays() {
        assertThat(Solution().numWays(3, 2), equalTo(4))
    }

    @Test
    fun numWays2() {
        assertThat(Solution().numWays(3, 2), equalTo(4))
    }

    @Test
    fun numWays3() {
        assertThat(Solution().numWays(4, 2), equalTo(8))
    }
}
