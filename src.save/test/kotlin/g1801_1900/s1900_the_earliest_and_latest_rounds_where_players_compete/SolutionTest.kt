package g1801_1900.s1900_the_earliest_and_latest_rounds_where_players_compete

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun earliestAndLatest() {
        assertThat(Solution().earliestAndLatest(11, 2, 4), equalTo(intArrayOf(3, 4)))
    }

    @Test
    fun earliestAndLatest2() {
        assertThat(Solution().earliestAndLatest(5, 1, 5), equalTo(intArrayOf(1, 1)))
    }
}
